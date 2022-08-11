package br.com.util;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.model.Atleta;

public class Calculo {

	static DecimalFormat df = new DecimalFormat("#0.00");
	static private String cor;

	public static String getCor() {
		return cor;
	}

	public static void setCor(String cor) {
		Calculo.cor = cor;
	}

	public Calculo() {

	}

	public static Date strToDate(String data) {
		try {
			return new SimpleDateFormat("yyyy-MM-dd").parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
			return new Date();
		}
	}

	private static int getIdade(Date data) {
		long diff = System.currentTimeMillis() - data.getTime();
		double indice = 1000 * 60 * 60 * 24 * 365.25;
		return (int) (diff / indice);
	}

	private static double getImc(double peso, double altura) {
		return (peso / Math.pow(altura, 2));
	}

	private static String getSituacao(double imc) {

		String res = "";

		if (imc <= 18.5) {
			res = "Abaixo do Peso ideal";
			cor = "MediumGreen";
		} else if (imc <= 24.9) {
			res = "Peso ideal";
			cor = "DodgerBlue";

		} else if (imc <= 29.9) {
			res = "Acima do Peso ideal";
			cor = "Tomato";

		} else if (imc <= 34.9) {
			res = "Obesidade I";
			cor = "Gray";
		} else {
			res = "Obesidade II";
			cor = "Black";
		}

		return res;
	}

	public static String relatorio(Atleta atleta) {
		
		String res = "";
		double imc = getImc(atleta.getPeso(), atleta.getAltura());
		
			res += "Atelta: " + atleta.getNome();
			res += "<br>Sexo: " + atleta.getSexo();
			res += "<br>Idade" + getIdade(atleta.getDtNascimento()) + " anos.";
			res += "<br>IMC: " + df.format(imc);
			res += "<br>Situação: " + getSituacao(imc);
			
			setCor(cor);
		return res;
	}


}
