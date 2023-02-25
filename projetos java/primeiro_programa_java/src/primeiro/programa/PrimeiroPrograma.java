package primeiro.programa;

import primeiro.programa.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		Livros livros = new Livros();
		Gato gato = new Gato();
		
		System.out.println(gato);
		System.out.println(livros);

	}

}
class Livros{
	private String nome;
	private String npag;
}