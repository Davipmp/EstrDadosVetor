package estruturaDados;

public class Aluno {

	private String nome;
	
//	metodo construtor
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
//	metodo para comparar dois objetos, comparar dois alunos, utiliza o equals.
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		return outro.getNome().equals(this.nome);
	}
	
//	apenas retornar o nome do aluno.
	@Override
	public String toString() { 
		return nome;
	}
	
	
}
