package br.com.m3Tech.utils;

public class IntegerUtils {
	
	private IntegerUtils() {};
	
	public static boolean isNotNull(Integer valor) {
		
		return !isNull(valor);
	}
	
	public static boolean isNull(Integer valor) {
		if(valor == null) {
			return true;
		}
		
		return false;
	}
	
	public static Integer zeroIfNull(Integer valor) {
		if(isNull(valor)) {
			return 0;
		}
		
		return valor;
	}


}
