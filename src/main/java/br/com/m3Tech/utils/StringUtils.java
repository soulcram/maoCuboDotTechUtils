package br.com.m3Tech.utils;

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

}
