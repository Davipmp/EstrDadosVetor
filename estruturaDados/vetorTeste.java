package estruturaDados;

public class vetorTeste {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("joao");
		Aluno a2 = new Aluno("Jose");
		
		Vetor lista = new Vetor();
		System.out.println(lista.tamanho());
		lista.adiciona(a1);
		System.out.println(lista.tamanho());
		lista.adiciona(a2);
		System.out.println(lista.tamanho());
		
		System.out.println(lista);
		
//		System.out.println(lista.contem(a1));
		
		Aluno a3 = new Aluno("Davizera");
		System.out.println(lista.contem(a3));
		
		lista.adiciona(1, a3);
		System.out.println(lista);
		
		lista.remove(1);
		System.out.println(lista);
		
	}
}
