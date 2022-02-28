package br.com.m3Tech.utils;

import java.text.Normalizer;

public class StringUtils {
	
	private StringUtils() {};
	
	public static boolean isNotEmpty(String valor) {
		
		return !isEmpty(valor);
	}
	
	public static boolean isEmpty(String valor) {
		if(isNull(valor)) {
			return true;
		}
		
		if(isBlank(valor)) {
			return true;
		}
		
		return false;
	}
	
	public static boolean isNull(String valor) {
		if(valor == null) {
			return true;
		}
		
		return false;
	}
	
	public static boolean isBlank(String valor) {
		if("".equals(valor.trim())) {
			return true;
		}
		
		return false;
	}
	
	public static boolean init(String valor) {
	
		return false;
	}
	
	public static boolean emptyOrNull(String valor) {
		return valor == null || "".equals(valor);
		
	}

	public static String limite(String nome, int i) {
		if(nome.length() > i) {
			return nome.substring(0, i -1);
		}else {
			return nome;
		}
	}

	public static String tamFinal(String nome, int i) {
		if(nome.length() > i) {
			return nome.substring(0, i);
		}else if(nome.length() < i) {
			for(int t = nome.length(); t < i; t++ ) {
				nome += " ";
			}
			return nome;
		}else {
			return nome;
		}
	}
	
	public static String removerAcentos(String value) {
		return Normalizer.normalize(value, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
	}

	public static boolean containsOnly(String s1, String s2) {
		
		for(char c : s1.toCharArray()) {
			String s = String.valueOf(c);
			if(!s2.contains(s)) {
				return false;
			}
		}
		
		
		return true;
	}

	public static boolean isNumeric(String s) {
				return containsOnly(s, "0123456789");
	}

}
