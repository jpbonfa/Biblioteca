package model;

public class Locacao {
	public int codigo;
	public Data dataDevolucao;
	public Data dataLocaocao;
	public Livro livro[];
	public Usuario usuario;

	public Locacao() {
	}

	public Locacao(int codigo, Data dataDevolucao, Data dataLocaocao,
			Livro[] livro, Usuario usuario) {

		this.codigo = codigo;
		this.dataDevolucao = dataDevolucao;
		this.dataLocaocao = dataLocaocao;
		this.livro = livro;
		this.usuario = usuario;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Data getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Data dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public Data getDataLocaocao() {
		return dataLocaocao;
	}

	public void setDataLocaocao(Data dataLocaocao) {
		this.dataLocaocao = dataLocaocao;
	}

	public Livro[] getLivro() {
		return livro;
	}

	public void setLivro(Livro[] livro) {
		this.livro = livro;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
