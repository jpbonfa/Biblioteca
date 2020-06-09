package model;

public class Autor {
	public int codigo;
	public String nome;
	public String nacionalidade;

	public Autor() {
	}

	public Autor(int codigo, String nome, String nacionalidade) {

		this.codigo = codigo;
		this.nome = nome;
		this.nacionalidade = nacionalidade;

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
}