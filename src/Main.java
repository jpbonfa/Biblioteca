import model.Autor;
import model.Data;
import model.Editora;
import model.Livro;
import model.Usuario;
import controller.Biblioteca;

public class Main {

	public static void main(String[] args) {

		Livro livros[] = new Livro[50];
		Usuario usuarios[] = new Usuario[50];

		Autor autor1 = new Autor();
		Autor autor2 = new Autor();
		Autor autor3 = new Autor();
		Autor autor4 = new Autor();
		Autor autor5 = new Autor();

		autor1.setCodigo(1);
		autor1.setNome("Machado De Assis");
		autor1.setNacionalidade("Brasileiro");

		autor2.setCodigo(2);
		autor2.setNome("Clarisse Lispector");
		autor2.setNacionalidade("Brasileira");

		autor3.setCodigo(3);
		autor3.setNome("Luis de Camões");
		autor3.setNacionalidade("Português");

		autor4.setCodigo(4);
		autor4.setNome("JK Rowling");
		autor4.setNacionalidade("Britânica");

		autor5.setCodigo(5);
		autor5.setNome("Monteiro Lobato");
		autor5.setNacionalidade("Brasileiro");

		Editora editora1 = new Editora();
		Editora editora2 = new Editora();
		Editora editora3 = new Editora();

		editora1.setCodigo(1);
		editora1.setNome("Editora Sabiá");
		editora1.setPais("Brasil");

		editora2.setCodigo(2);
		editora2.setNome("Livraria Saraiva");
		editora2.setPais("Brasil");

		editora3.setCodigo(3);
		editora3.setNome("Special Book Services");
		editora3.setPais("Estados Unidos ");

		Livro livro1 = new Livro();
		Livro livro2 = new Livro();
		Livro livro3 = new Livro();
		Livro livro4 = new Livro();
		Livro livro5 = new Livro();
		Livro livro6 = new Livro();
		Livro livro7 = new Livro();
		Livro livro8 = new Livro();
		Livro livro9 = new Livro();
		Livro livro10 = new Livro();

		livro1.setCodigo(1);
		livro1.setTitulo("Don Casmurro");
		livro1.setAnoPublicacao(1899);
		livro1.setAutor(autor1);
		livro1.setEditora(editora1);
		livro1.setDisponivel(true);

		livro2.setCodigo(2);
		livro2.setTitulo("Memorias postomas de Bras Cubas");
		livro2.setAnoPublicacao(1881);
		livro2.setAutor(autor1);
		livro2.setEditora(editora3);
		livro2.setDisponivel(true);

		livro3.setCodigo(3);
		livro3.setTitulo("Agua viva");
		livro3.setAnoPublicacao(1973);
		livro3.setAutor(autor2);
		livro3.setEditora(editora2);
		livro3.setDisponivel(true);

		livro4.setCodigo(4);
		livro4.setTitulo("A hora da estrela");
		livro4.setAnoPublicacao(1977);
		livro4.setAutor(autor2);
		livro4.setEditora(editora1);
		livro4.setDisponivel(true);

		livro5.setCodigo(5);
		livro5.setTitulo("Os lusiadas");
		livro5.setAnoPublicacao(1572);
		livro5.setAutor(autor3);
		livro5.setEditora(editora3);
		livro5.setDisponivel(true);

		livro6.setCodigo(6);
		livro6.setTitulo("Sonetos de luis camões");
		livro6.setAnoPublicacao(1595);
		livro6.setAutor(autor3);
		livro6.setEditora(editora2);
		livro6.setDisponivel(true);

		livro7.setCodigo(7);
		livro7.setTitulo("Harry Potter e a pedra filosofal");
		livro7.setAnoPublicacao(1997);
		livro7.setAutor(autor4);
		livro7.setEditora(editora1);
		livro7.setDisponivel(true);

		livro8.setCodigo(8);
		livro8.setTitulo("Harry Potter e o calice de foga");
		livro8.setAnoPublicacao(2001);
		livro8.setAutor(autor4);
		livro8.setEditora(editora2);
		livro8.setDisponivel(true);

		livro9.setCodigo(9);
		livro9.setTitulo("O saci");
		livro9.setAnoPublicacao(1921);
		livro9.setAutor(autor5);
		livro9.setEditora(editora2);
		livro9.setDisponivel(true);

		livro10.setCodigo(10);
		livro10.setTitulo("O picapau amarelo");
		livro10.setAnoPublicacao(1939);
		livro10.setAutor(autor5);
		livro10.setEditora(editora1);
		livro10.setDisponivel(true);

		livros[0] = livro1;
		livros[1] = livro2;
		livros[2] = livro3;
		livros[3] = livro4;
		livros[4] = livro5;
		livros[5] = livro6;
		livros[6] = livro7;
		livros[7] = livro8;
		livros[8] = livro9;
		livros[9] = livro10;

		Data data1 = new Data();
		Data data2 = new Data();
		Data data3 = new Data();
		Data data4 = new Data();
		Data data5 = new Data();

		data1.setDia(1);
		data1.setMes(1);
		data1.setAno(1998);

		data2.setDia(2);
		data2.setMes(2);
		data2.setAno(2008);

		data3.setDia(3);
		data3.setMes(3);
		data3.setAno(1993);

		data4.setDia(4);
		data4.setMes(4);
		data4.setAno(2011);

		data5.setDia(5);
		data5.setMes(5);
		data5.setAno(1988);

		Usuario usuario1 = new Usuario();
		Usuario usuario2 = new Usuario();
		Usuario usuario3 = new Usuario();
		Usuario usuario4 = new Usuario();
		Usuario usuario5 = new Usuario();

		usuario1.setCodigo(1);
		usuario1.setNome("Jeff");
		usuario1.setDatadenascimento(data1);
		usuario1.setTelefone("11987110380");
		usuario1.setEmail("teste1@teste1");

		usuario2.setCodigo(2);
		usuario2.setNome("Joao");
		usuario2.setDatadenascimento(data2);
		usuario2.setTelefone("11983623910");
		usuario2.setEmail("teste2@teste2");

		usuario3.setCodigo(3);
		usuario3.setNome("Toni");
		usuario3.setDatadenascimento(data3);
		usuario3.setTelefone("11923430342");
		usuario3.setEmail("teste3@teste3");

		usuario4.setCodigo(4);
		usuario4.setNome("Carl");
		usuario4.setDatadenascimento(data4);
		usuario4.setTelefone("11997613310");
		usuario4.setEmail("teste4@test4");

		usuario5.setCodigo(5);
		usuario5.setNome("Anto");
		usuario5.setDatadenascimento(data5);
		usuario5.setTelefone("11986560233");
		usuario5.setEmail("teste5@teste5");

		usuarios[0] = usuario1;
		usuarios[1] = usuario2;
		usuarios[2] = usuario3;
		usuarios[3] = usuario4;
		usuarios[4] = usuario5;
		
		new Biblioteca(livros, usuarios);

	}
}
