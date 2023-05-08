package estruturaDados;

import java.util.ArrayList;
import java.util.Arrays;

//estrutura de dados, armazenamento sequencial. 
public class Vetor {

	private Aluno[] alunos = new Aluno[100];
	
//	o zero aponta pra gente quantos alunos eu tenho cadastrados no array e a proxima posicao vazia
	private int totalAlunos = 0;

//	recebe o aluno
	public void adiciona(Aluno aluno) { // adiciona no fim da lista.
		this.alunos[totalAlunos] = aluno; // total de aluno aponta um buraco no array, ou seja o lugar que esteja vazio
		totalAlunos++;
	}

	public boolean posicaoValida(int posicao) { // valida se a posicao realmente e valida no vetor.
		return posicao >= 0 && posicao <= totalAlunos;
	}

	// adiciona em qualquer lugar da lista
	public void adiciona(int posicao, Aluno aluno) {

		if (!posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posicao inválida");
		}

		for (int i = totalAlunos - 1; i >= posicao; i -= 1) { // ira comecar da ultima posicao que tem alguem, o for
																// empurra todo mundo um pra direita,
																// abriu espaco, coloca o aluno la dentro
			alunos[i + 1] = alunos[i]; // pegando a posicao mais a direita e colocando quem esta a esquerda
		}

		alunos[posicao] = aluno; // buraco da posicao, vai entrar o aluno que queira colocar agora .
		totalAlunos++;
	}

//	metodo auxiliar, ira nos dizer se o numero da posicao esta ocupado, ou não. 
	private boolean posicaoOcupado(int posicao) {
		return posicao >= 0 && posicao < totalAlunos; // pra ela estar ocupada preciso saber em quais numeros ela esta.
														// (posicao ocupada).
	}

//	recebe uma posicao do aluno, vai devolver o aluno que esta naquela posicao da minha lista
	public Aluno pega(int posicao) {

		if (!posicaoOcupado(posicao)) {
			throw new IllegalArgumentException("Posicao Inválida");
		}
		return alunos[posicao];
	}

//	ira remover a posicao.
	public void remove(int posicao) {
		for (int i = posicao; i < this.totalAlunos; i++) {
			this.alunos[i] = this.alunos[i + 1]; // comeco na posicao que eu quero remover, pego quem esta a minha
													// direita e trazer pra ele pra nova posicao. a posicao removida foi
													// substituida pela que estava
													// a direita.
		}
		totalAlunos--;
	}

//	pergunta pra minha lista se o aluno esta, ou nao esta na lista. 
	public boolean contem(Aluno aluno) {
		for (int i = 0; i < totalAlunos; i++) { // ira varrez o array até a posição que eu sei que tem
												// alguém.(totalAlunos).
			if (alunos.equals(alunos[i]))
				;
			{ // se o aluno que eu quero comparar for igual ao aluno na posicao i do meu
				// array, se forem iguais
				return true; // retorna true.
			}
		}
		return false;
	}

//	devolve o tamanho a quantidade de itens que esta neste vetor.
	public int tamanho() {
		return totalAlunos;

	}

//	facilitar a impressao, pegar todos os elementos do array e chamar o tostring de todos eles.
	@Override
	public String toString() {
		return Arrays.toString(alunos);
	}
}
