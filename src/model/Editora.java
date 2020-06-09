package model;

public class Editora {
	public int codigo;
	public String nome;
	public String pais;

	public Editora(int codigo, String nome, String pais) {

		this.codigo = codigo;
		this.nome = nome;
		this.pais = pais;
	}

	public Editora() {

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

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

}
