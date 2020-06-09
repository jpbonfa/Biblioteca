package controller;

import javax.swing.JOptionPane;

import model.Autor;
import model.Data;
import model.Editora;
import model.Livro;
import model.Locacao;
import model.Usuario;
import util.Mensagem;
import util.Util;
import util.Valida;

public class Biblioteca {

	public int opcao;
	public String dataAtual;
	public int dataQuebrada[];
	public Livro livros[] = new Livro[50];
	public Usuario usuarios[] = new Usuario[50];
	public Locacao locacoes[] = new Locacao[50];

	// variáveis de editora
	public int codigoEditora;
	public String nomeEditora;
	public String paisEditora;

	// variáveis de livro
	public int codigoLivro, anoPublicacaoLivro, disponivelLivro;
	public String tituloLivro;

	// variáveis de autor
	public int codigoAutor;
	public String nomeAutor;
	public String nascionalidadeAutor;

	// variaveis data
	public int dia;
	public int mes;
	public int ano;

	// variaveis Usuario
	public int codigoUsuario;
	public String nomeUsuario;
	public String telefoneUsuario;
	public String emailUsuario;

	// variaveis de locação
	public int codigolocacao;
	public int quantidadeLivros;
	public int codigoLivrosLocacao[];
	public String dataDevolucao;
	public int codigoUsuarioLocacao;

	public Biblioteca(Livro livros[], Usuario usuarios[]) {
		this.livros = livros;
		this.usuarios = usuarios;
		dataAtual = Util.pegarDataSistema("dd/MM/yyyy");
		escolhaOpcao();
	}

	public void escolhaOpcao() {// inicio do metodo
		boolean valido = true;
		while (valido) {// inicio do while
			try {// inicio do try
				opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
						Mensagem.informeOpcao));

				switch (opcao) {// inicio do switch
				case 1:

					cadastrarLivro();
					break;
				case 2:
					cadastrarUsuarios();
					break;
				case 3:
					efetuarLocacao();
					break;
				case 4:

					break;
				case 5:
					listarLivros();
					break;
				case 6:
					listarUsuarios();
					break;
				case 7:
					pesquisaEditora();
					break;
				case 8:
					pesquisaAutor();
					break;

				case 9:
					listarLocacao();
					break;
				case 10:
					System.exit(0);
					break;
				default:
					JOptionPane.showMessageDialog(null, Mensagem.opcaoInvalida);
					break;

				}// fim do switch

			} catch (Exception e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, Mensagem.valorInvalido);
			}// fim do try

		}// fim do while
	}// fim do metodo

	public void cadastrarLivro() {// inicio do metodo
		informeLivro();
		informeEditora();
		informeAutor();
		gravaLivro();

	}// fim do metodo

	public void informeLivro() {// inicio do metodo
		boolean valido = true;

		while (valido) {// incio while
			try {// inicio try
				codigoLivro = Integer.parseInt(JOptionPane
						.showInputDialog(Mensagem.informeCodigoLivro));
				if (!Valida.verificaIntZero(codigoLivro)) {
					valido = false;

				} else {
					JOptionPane.showMessageDialog(null,
							Mensagem.informeCodigoLivro
									+ Mensagem.campoObrigatorio);
				}

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, Mensagem.valorInvalido);

			}// fim try

		}// fim while
		valido = true;

		while (valido) {// inicio while
			tituloLivro = JOptionPane
					.showInputDialog(Mensagem.informeTituloLivro);
			if (!Valida.verificaStringVazio(tituloLivro)) {
				valido = false;
			} else {
				JOptionPane.showMessageDialog(null, Mensagem.informeTitulo
						+ Mensagem.campoObrigatorio);

			}
		}// fim while
		valido = true;
		while (valido) {// incio while
			try {// inicio try
				anoPublicacaoLivro = Integer.parseInt(JOptionPane
						.showInputDialog(Mensagem.informeAnoPublicacaoLivro));
				if (!Valida.verificaIntZero(anoPublicacaoLivro)) {
					valido = false;

				} else {
					JOptionPane.showMessageDialog(null,
							Mensagem.informeAnoPublicacao
									+ Mensagem.campoObrigatorio);
				}

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, Mensagem.valorInvalido);

			}// fim try

		}// fim while
		valido = true;
		while (valido) {// inicio while
			try {// inicio try
				disponivelLivro = Integer.parseInt(JOptionPane
						.showInputDialog(Mensagem.informeDisponibilidade + "\n"
								+ Mensagem.informeSim + "\n"
								+ Mensagem.informeNao));
				if (Valida.validaDisponivel(disponivelLivro)) {// inicio if
					valido = false;
				} else {
					JOptionPane.showMessageDialog(null,
							Mensagem.informeDisponibilidade
									+ Mensagem.campoObrigatorio);

				}// fim if
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, Mensagem.valorInvalido);
			}// fim try

		}// fim while

	}// fim do metodo

	public void informeEditora() {
		boolean valido = true;

		while (valido) {// inicio while
			try {
				codigoEditora = Integer.parseInt(JOptionPane
						.showInputDialog(Mensagem.informeCodigoEditora));
				if (!Valida.verificaIntZero(codigoEditora)) {// inicio if
					valido = false;
				} else {
					JOptionPane.showMessageDialog(null, Mensagem.informeCodigo
							+ Mensagem.campoObrigatorio);

				}// fim if
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, Mensagem.valorInvalido);
			}

		}// fim while

		valido = true;

		while (valido) {// inicio while
			nomeEditora = JOptionPane
					.showInputDialog(Mensagem.informeNomeEditora);
			if (!Valida.verificaStringVazio(nomeEditora)) {// inicio if
				valido = false;
			} else {
				JOptionPane.showMessageDialog(null, Mensagem.informeNome
						+ Mensagem.campoObrigatorio);

			}// fim if
		}// fim while

		valido = true;

		while (valido) {// inicio while
			paisEditora = JOptionPane
					.showInputDialog(Mensagem.informePaisEditora);
			if (!Valida.verificaStringVazio(paisEditora)) {// inicio if
				valido = false;
			} else {
				JOptionPane.showMessageDialog(null, Mensagem.informePaisEditora
						+ Mensagem.campoObrigatorio);

			}// fim if
		}// fim while

	}// fim do metodo

	public void informeAutor() {// inicio do metodo
		boolean valido = true;
		while (valido) {// inicio while
			try {// inicio try
				codigoAutor = Integer.parseInt(JOptionPane
						.showInputDialog(Mensagem.informeCodigoAutor));
				if (!Valida.verificaIntZero(codigoAutor)) {// inicio if
					valido = false;
				} else {
					JOptionPane.showMessageDialog(null, Mensagem.informeCodigo
							+ Mensagem.campoObrigatorio);

				}// fim if
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, Mensagem.valorInvalido);
			}// fim try
		}// fim while
		valido = true;
		while (valido) {// inicio while
			nomeAutor = JOptionPane.showInputDialog(Mensagem.informeNomeAutor);
			if (!Valida.verificaStringVazio(nomeAutor)) {// inicio if
				valido = false;
			} else {
				JOptionPane.showMessageDialog(null, Mensagem.informeNome
						+ Mensagem.campoObrigatorio);

			}// fim if

		}// fim while
		valido = true;
		while (valido) {// inicio while
			nascionalidadeAutor = JOptionPane
					.showInputDialog(Mensagem.informeNascionalidadeAutor);
			if (!Valida.verificaStringVazio(nascionalidadeAutor)) {// inicio if
				valido = false;
			} else {
				JOptionPane.showMessageDialog(null, Mensagem.informeNome
						+ Mensagem.campoObrigatorio);

			}// fim if

		}// fim while

	}// fim do metodo

	public void gravaLivro() {// inicio do metodo
		Livro livro = new Livro();
		Autor autor = new Autor();
		Editora editora = new Editora();

		editora.setCodigo(codigoEditora);
		editora.setNome(nomeEditora);
		editora.setPais(paisEditora);

		autor.setCodigo(codigoAutor);
		autor.setNome(nomeAutor);

		livro.setCodigo(codigoLivro);
		livro.setTitulo(tituloLivro);
		livro.setEditora(editora);
		livro.setAutor(autor);
		livro.setAnoPublicacao(anoPublicacaoLivro);

		if (disponivelLivro == 1) {// inicio if
			livro.setDisponivel(true);
		} else {
			livro.setDisponivel(false);
		}// fim do if

		for (int i = 0; i < livros.length; i++) {// inicio for
			if (livros[i] == null) {// inicio if
				livros[i] = livro;
				JOptionPane.showMessageDialog(null, Mensagem.livroSalvo);
				break;
			}// fim if
		}// fim for
	}// fim do metodo

	public void listarLivros() {// inicio do metodo
		int aux = 0;
		String mensagem = "";

		for (Livro livro : livros) {// inicio for
			if (livro != null) {// inicio if
				mensagem += livro.getCodigo() + " - " + livro.getTitulo()
						+ "\n";
				aux++;
			}// fim do if

		}// fim for
		if (aux == 0) {// inicio if
			JOptionPane.showMessageDialog(null, Mensagem.semLivros);

		} else {
			JOptionPane.showMessageDialog(null, Mensagem.livroscadastrado
					+ "\n\n" + mensagem);
		}// fim do if

	}// fim fo metodo

	public void cadastrarUsuarios() {
		informeCodigoUsuario();
		informeNomeUsuario();
		informeDataNascimentoUsuario();
		informeTelefoneUsuario();
		informeEmailUsuario();
		gravaUsuario();
	}

	public void informeCodigoUsuario() {// inicio do metodo
		boolean valido = true;

		while (valido) {// inicio while
			try {// inicio try
				codigoUsuario = Integer.parseInt(JOptionPane
						.showInputDialog(Mensagem.informeCodigoUsuario));
				if (!Valida.verificaIntZero(codigoUsuario)) {// inicio if
					valido = false;
				} else {
					JOptionPane.showMessageDialog(null,
							Mensagem.informeCodigoUsuario
									+ Mensagem.campoObrigatorio);

				}// fim if
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, Mensagem.valorInvalido);
			}// fim try
		}// fim while

	}// fim do metodo

	public void informeNomeUsuario() {// inicio do metodo
		boolean valido = true;
		while (valido) {// inicio while
			nomeUsuario = JOptionPane
					.showInputDialog(Mensagem.informeNomeUsuario);
			if (!Valida.verificaStringVazio(nomeUsuario)) {// inicio if
				valido = false;
			} else {
				JOptionPane.showMessageDialog(null, Mensagem.informeNome
						+ Mensagem.campoObrigatorio);

			}// fim if

		}// fim while

	}// fim do metodo

	public void informeDataNascimentoUsuario() {// inicio do metodo
		boolean valido = true;
		while (valido) {// inicio do while
			try {// inicio do try
				dia = Integer.parseInt(JOptionPane
						.showInputDialog(Mensagem.informeDiaNascimento));
				if (!Valida.verificaDiaNascimento(dia)) {// inicio do if

					valido = false;

				} else {
					JOptionPane.showMessageDialog(null,
							Mensagem.informeDiaNascimento
									+ Mensagem.campoObrigatorio);

				}// fim do if
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, Mensagem.valorInvalido);
			}// fim do try

		}// fim do while
		valido = true;
		while (valido) {// inicio do while
			try {// inicio try
				mes = Integer.parseInt(JOptionPane
						.showInputDialog(Mensagem.informeMesNascimento));
				if (Valida.verificaMesNascimento(mes)) {// inicio if
					valido = false;

				} else {
					JOptionPane.showMessageDialog(null,
							Mensagem.informeMesNascimento
									+ Mensagem.campoObrigatorio);

				}// fim if
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, Mensagem.valorInvalido);
			}// fim do try

		}// fim do while
		valido = true;
		while (valido) {// inicio while
			try {// inicio try
				ano = Integer.parseInt(JOptionPane
						.showInputDialog(Mensagem.informeAnoNascimento));
				valido = false;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, Mensagem.valorInvalido);
			}// fim try
		}// fim while
	}// fim do metodo

	public void informeTelefoneUsuario() {// inicio do metodo
		boolean valido = true;
		while (valido) {// inicio do while
			telefoneUsuario = JOptionPane
					.showInputDialog(Mensagem.informeTelefone);
			if (!Valida.verificaStringVazio(telefoneUsuario)) {
				valido = false;
			} else {
				JOptionPane.showMessageDialog(null, Mensagem.informeTelefone
						+ Mensagem.campoObrigatorio);

			}

		}// fim do while
	}// fim do metodo

	public void informeEmailUsuario() {// inicio do metodo
		boolean valido = true;
		while (valido) {// inicio do while
			emailUsuario = JOptionPane.showInputDialog(Mensagem.informeEmail);
			if (Valida.validaEmail(emailUsuario)) {
				valido = false;

			} else {
				JOptionPane.showMessageDialog(null, Mensagem.informeEmail
						+ Mensagem.campoObrigatorio);

			}

		}// fim do while

	}// fim do metodo

	public void gravaUsuario() {// inicio do metodo

		Usuario usuario = new Usuario();
		Data data = new Data();

		data.setDia(dia);
		data.setMes(mes);
		data.setAno(ano);

		usuario.setCodigo(codigoUsuario);
		usuario.setNome(nomeUsuario);
		usuario.setDatadenascimento(data);
		usuario.setEmail(emailUsuario);
		usuario.setTelefone(telefoneUsuario);

		for (int i = 0; i < usuarios.length; i++) {// inicio for
			if (usuarios[i] == null) {// inicio if
				usuarios[i] = usuario;
				JOptionPane.showMessageDialog(null, Mensagem.UsuarioGravado);
				break;
			}// fim if
		}// fim do for

	}// fim do metodo

	public void listarUsuarios() { // inicio do metodo

		int aux = 0;
		String mensagem = "";

		for (Usuario usuario : usuarios) {// inicio for
			if (usuario != null) {// inicio if
				mensagem += usuario.getCodigo() + " - " + usuario.getNome()
						+ "\n";
				aux++;
			}// fim do if

		}// fim for
		if (aux == 0) {// inicio if
			JOptionPane.showMessageDialog(null, Mensagem.semUsuarios);

		} else {
			JOptionPane.showMessageDialog(null, Mensagem.usuariosCadastrados
					+ ": \n\n " + mensagem);
		}// fim do if

	}// fim do metodo

	public void pesquisaEditora() {// inicio do metodo
		boolean valido = true;
		String pesquisaEditora = "";
		String mensagem = "";
		int aux = 0;
		while (valido) {// inicio while
			pesquisaEditora = JOptionPane
					.showInputDialog(Mensagem.informeEditora);
			if (!Valida.verificaStringVazio(pesquisaEditora)) {// inicio do if
				valido = false;

			} else {
				JOptionPane.showMessageDialog(null, Mensagem.informeEditora
						+ Mensagem.campoObrigatorio);
			}// fim do if
		}// fim while
		for (Livro livro : livros) {// inicio do for
			if (livro != null) {// inicio if1
				if (livro.getEditora().getNome()
						.equalsIgnoreCase(pesquisaEditora)) {// inicio if2
					mensagem += livro.getCodigo() + " - " + livro.getTitulo()
							+ "\n";
					aux++;
				}// fim do if2

			}// fim do if
		}// final do for
		if (aux == 0) {
			JOptionPane.showMessageDialog(null, "Nenhum livro para editora "
					+ pesquisaEditora + " foi cadastrado");
		} else {
			JOptionPane.showMessageDialog(null,
					"Livros cadastrados para a editora " + pesquisaEditora
							+ ":" + "\n" + mensagem);
		}

	}// fim do metodo

	public void pesquisaAutor() {// inicio do metodo
		boolean valido = true;
		String pesquisaAutor = "";
		String mensagem = "";
		int aux = 0;
		while (valido) {// inicio while
			pesquisaAutor = JOptionPane.showInputDialog(Mensagem.informeAutor);
			if (!Valida.verificaStringVazio(pesquisaAutor)) {// inicio do if
				valido = false;

			} else {
				JOptionPane.showMessageDialog(null, Mensagem.informeAutor
						+ Mensagem.campoObrigatorio);
			}// fim do if
		}// fim while
		for (Livro livro : livros) {// inicio do for
			if (livro != null) {// inicio if1
				if (livro.getAutor().getNome().equalsIgnoreCase(pesquisaAutor)) {// inicio
																					// if2
					mensagem += livro.getCodigo() + " - " + livro.getTitulo()
							+ "\n";
					aux++;
				}// fim do if2

			}// fim do if
		}// final do for
		if (aux == 0) {
			JOptionPane.showMessageDialog(null, "Nenhum livro para o autor "
					+ pesquisaAutor + " foi cadastrado");
		} else {
			JOptionPane.showMessageDialog(null,
					"Livros cadastrados para o autor  " + pesquisaAutor + ":"
							+ "\n" + mensagem);
		}
	}// fim do metodo

	public void efetuarLocacao() {// inicio do metodo
		informeCodigoLocacao();
		informeUsuarioLocacao();
		informeDataDevolucao();
		informeQuantidadeLivros();
		informeLivros();
		gravarLocacao();
	}// fim do metodo

	public void informeCodigoLocacao() {// inicio do metodo
		boolean valido = true;
		while (valido) {// inicio do while
			try {// inicio do try
				codigolocacao = Integer.parseInt(JOptionPane
						.showInputDialog(Mensagem.informeCodigoLocacao));
				if (!Valida.verificaIntZero(codigolocacao)) {// inicio do if
					valido = false;
				} else {
					JOptionPane.showMessageDialog(null,
							Mensagem.informeCodigoLocacao
									+ Mensagem.campoObrigatorio);

				}// fim do if
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, Mensagem.valorInvalido);

			}// fim do try
		}// fim do while
	}// fim do metodo

	public void informeDataDevolucao() {// inicio do metodo

		boolean valido = true;
		while (valido) {// inicio do while
			try {// inicio do try
				dataDevolucao = Util.informeMascara("##/##/####",
						"Data da devolução", "Locação de livros");
				if (!Valida.verificaStringVazio(dataDevolucao)) {// inicio do if
					valido = false;
				} else {
					JOptionPane.showMessageDialog(null, Mensagem.dataDevolucao
							+ Mensagem.campoObrigatorio);

				}// fim do if
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, Mensagem.valorInvalido);

			}// fim do try
		}// fim do while
	}// fim do metodo

	public void informeQuantidadeLivros() {// inicio do metodo

		boolean valido = true;
		while (valido) {// inicio do while
			try {// inicio do try
				quantidadeLivros = Integer.parseInt(JOptionPane
						.showInputDialog(Mensagem.quantidadeLivros));
				if (!Valida.verificaIntZero(quantidadeLivros)) {// inicio do if
					valido = false;
				} else {
					JOptionPane.showMessageDialog(null,
							"Informe a quantidade de livros"
									+ Mensagem.campoObrigatorio);

				}// fim do if
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, Mensagem.valorInvalido);

			}// fim do try
		}// fim do while
	}// fim do metodo

	public void informeLivros() {// inicio do metodo
		String mensagem = "";

		for (Livro livro : livros) {// inicio for
			if (livro != null) {// inicio if
				mensagem += livro.getCodigo() + " - " + livro.getTitulo()
						+ "\n";
			}// fim do if

		}// fim for

		codigoLivrosLocacao = new int[quantidadeLivros];

		int aux = 0;
		for (int i = 0; i < quantidadeLivros; i++) {// inicio do for

			boolean valido = true;
			while (valido) {// inicio do while
				try {// inicio do try
					aux = Integer.parseInt(JOptionPane
							.showInputDialog(Mensagem.informeCodigoLivro
									+ "   \n\n" + mensagem));
					if (!Valida.verificaIntZero(aux)) {// inicio do
						codigoLivrosLocacao[i] = aux; // if
						valido = false;
					} else {
						JOptionPane.showMessageDialog(null,
								"Informe a quantidade de livros"
										+ Mensagem.campoObrigatorio);

					}// fim do if
				} catch (Exception e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(null, Mensagem.valorInvalido);

				}// fim do try
			}// fim do while

		}// fim do for
	}// fim do metodo

	public void informeUsuarioLocacao() {
		int aux = 0;
		String mensagem = "";

		for (Usuario usuario : usuarios) {// inicio for
			if (usuario != null) {// inicio if
				mensagem += usuario.getCodigo() + " - " + usuario.getNome()
						+ "\n";
				aux++;
			}// fim do if

		}// fim for

		boolean valido = true;
		while (valido) {// inicio do while
			try {// inicio do try
				codigoUsuarioLocacao = Integer.parseInt(JOptionPane
						.showInputDialog(Mensagem.informeCodigoUsuario
								+ "  \n\n" + mensagem));
				if (!Valida.verificaIntZero(codigoUsuarioLocacao)) {// inicio do
																	// if

					valido = false;
				} else {
					JOptionPane.showMessageDialog(null,
							Mensagem.informeCodigoUsuario
									+ Mensagem.campoObrigatorio);

				}// fim do if
			} catch (Exception e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, Mensagem.valorInvalido);

			}// fim do try
		}// fim do while

	}// fim do metodo

	public void gravarLocacao() {// inicio do metodo

		Locacao locacao = new Locacao();
		Data data1 = new Data();
		Data data2 = new Data();
		Livro livros[] = new Livro[quantidadeLivros];

		locacao.setCodigo(codigolocacao);

		dataQuebrada = Util.quebraData(dataDevolucao);
		data1.setDia(dataQuebrada[0]);
		data1.setMes(dataQuebrada[1]);
		data1.setAno(dataQuebrada[2]);
		locacao.setDataDevolucao(data1);

		dataQuebrada = Util.quebraData(dataAtual);
		data2.setDia(dataQuebrada[0]);
		data2.setMes(dataQuebrada[1]);
		data2.setAno(dataQuebrada[2]);
		locacao.setDataLocaocao(data2);

		int i = 0;

		for (int codigo : codigoLivrosLocacao) {// inicio for2

			for (Livro livro : this.livros) {// inicio do for1
				if (livro != null) {
					if (codigo == livro.getCodigo()) {
						livros[i] = livro;
						livro.setDisponivel(false);
						i++;
					}					
				}
			}// fim do for1
		}// fim do for2
		locacao.setLivro(livros);

		for (Usuario user : usuarios) {// inicio for
			if (codigoUsuarioLocacao == user.getCodigo()) {// inicio if
				locacao.setUsuario(user);
				break;
			}// fim if
		}// fim for

		for (int j = 0; j < locacoes.length; j++) {
			if (locacoes[j] == null) {// inicio if
				locacoes[j] = locacao;
				JOptionPane.showMessageDialog(null,
						"Locação efetuada com sucesso");
				break;
			}// fim do if
		}

	}// fim do metodo

	public void listarLocacao() {// inicio do metodo
		String mensagem = "";
		int aux = 0;
		for (Locacao locacao : locacoes) {// inicio do for
			if (locacao != null) {// inicio do if
				aux++;
				mensagem += locacao.getCodigo() + " - "
						+ locacao.getUsuario().getNome() + " - "
						+ locacao.getDataLocaocao() + "\n";
			}// fim do if
		}// fim do for
		if (aux == 0 ) {
			JOptionPane.showMessageDialog(null, "Não existem locações cadastradas");
		}else {
			JOptionPane.showMessageDialog(null, "Locações cadastradas: \n\n" + mensagem);
		}
	}// fim do metodo

}// fim da classe