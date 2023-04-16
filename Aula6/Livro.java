public class Livro {

private int Isbn;
private String Nome;
private String Editora;
private Autor Autor;

public Livro(int isbn, String nome, String editora, Autor autor) {
	super();
	Isbn = isbn;
	Nome = nome;
	Editora = editora;
	Autor = autor;
}

public int getIsbn() {
	return Isbn;
}

public String getNome() {
	return Nome;
}

public void setNome(String nome) {
	Nome = nome;
}

public String getEditora() {
	return Editora;
}

public void setEditora(String editora) {
	Editora = editora;
}

public Autor getAutor() {
	return Autor;
	}
}