package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class Util {// inicio da classe

	public static String informeMascara(String mask, String msg, String title)
			throws ParseException {// inicio do metodo
		// variavel de retorno do metodo
		String retorno = null;
		// criar a mensagem a ser exibida
		JLabel label = new JLabel(msg);
		// cria a mascara utilizada no componente
		JFormattedTextField fmt = new JFormattedTextField(new MaskFormatter(
				mask));

		JOptionPane.showConfirmDialog(null, new Object[] { label, fmt }, title,
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE);

		retorno = new String(fmt.getText());

		return retorno;

	}// fim do metodo

	public static String pegarDataSistema(String fmt) {// inicio do metodo
		// variavel de retorno do metodo
		String retorno = "";
		// instancia do objeto do tipo Data para capturar a data do sistema

		Date dataAtual = new Date();
		// instacia do formato utilizado para o formato da data retonada
		SimpleDateFormat formato = new SimpleDateFormat(fmt);

		retorno = formato.format(dataAtual);

		return retorno;
	}// fim do metodo

	public static int[] quebraData(String data) {// inicio do metodo
		// variavel do retorno do metodo
		int retorno[] = new int[3];
		// procedimento para separar os elementos da data recebida
		String aux[] = data.split("/");
		// valorizando posição 0 - dia
		retorno[0] = Integer.parseInt(aux[0]);
		// valorizando posição 1 -mês
		retorno[1] = Integer.parseInt(aux[1]);
		// valorizando posição 2 -ano
		retorno[2] = Integer.parseInt(aux[2]);

		return retorno;

	}// fim do metodo
}// fim da classe
