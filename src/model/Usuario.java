package model;

public class Usuario {
	public int codigo;
	public String nome;
	public String telefone;
	public Data datadenascimento;
	public String email;

	public Usuario() {
	}

	public Usuario(int codigo, String nome, String telefone,
			Data datadenascimento, String email) {

		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
		this.datadenascimento = datadenascimento;
		this.email = email;
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Data getDatadenascimento() {
		return datadenascimento;
	}

	public void setDatadenascimento(Data datadenascimento) {
		this.datadenascimento = datadenascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
