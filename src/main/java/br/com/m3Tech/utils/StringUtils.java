package br.com.m3Tech.utils;

import java.math.BigDecimal;
import java.text.Normalizer;
import java.text.NumberFormat;
import java.util.regex.Pattern;

public class StringUtils {

	private StringUtils() {
	}

	public static boolean isNotEmpty(String valor) {

		return !isEmpty(valor);
	}

	public static boolean isEmpty(String valor) {
		if (isNull(valor)) {
			return true;
		}

		if (isBlank(valor)) {
			return true;
		}

		return false;
	}

	public static boolean isNull(String valor) {
		if (valor == null) {
			return true;
		}

		return false;
	}

	public static boolean isBlank(String valor) {
		if ("".equals(valor.trim())) {
			return true;
		}

		return false;
	}

	public static boolean init(String valor) {

		return false;
	}

	public static boolean emptyOrNull(String valor) {
		return valor == null || isBlank(valor);

	}

	public static String limite(String nome, int i) {
		if (nome.length() > i) {
			return nome.substring(0, i - 1);
		} else {
			return nome;
		}
	}

	public static String tamFinal(String nome, int i) {
		if (nome.length() > i) {
			return nome.substring(0, i);
		} else if (nome.length() < i) {
			for (int t = nome.length(); t < i; t++) {
				nome += " ";
			}
			return nome;
		} else {
			return nome;
		}
	}

	public static String getFormatoMoeda(BigDecimal valor) {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		return nf.format(valor);
	}

	public static String removerAcentos(String value) {

		if (isNull(value)) {
			return "";
		}

		return Normalizer.normalize(value, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
	}

	public static boolean containsOnly(String s1, String s2) {

		for (char c : s1.toCharArray()) {
			String s = String.valueOf(c);
			if (!s2.contains(s)) {
				return false;
			}
		}

		return true;
	}

	public static boolean isNumeric(String s) {
		return containsOnly(s, "0123456789");
	}

	public static boolean endsWith(String valor, String caracter) {
		if(valor == null || caracter == null){
			return false;
		}

		return caracter.equals(valor.substring(valor.length() -1));
	}

	public static String remove(String valor, String caracter) {
		if(valor == null){
			return "";
		}
		if(caracter == null){
			return valor;
		}
		return valor.replaceAll(Pattern.quote(caracter),"");
	}

	public static String removeEnd(String valor, String caracter) {
		if(valor == null){
			return "";
		}
		if(caracter == null || !endsWith(valor,caracter)){
			return valor;
		}

		return valor.substring(0,valor.length() - 1);

	}
}
