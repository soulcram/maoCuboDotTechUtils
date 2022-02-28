package br.com.m3Tech.utils;

public class BooleanUtils {
	
	private BooleanUtils() {}
	
	public static boolean isNull(Boolean valor) {
		return valor == null;
	}
	
	public static Boolean defaultFalseIfNull(Boolean valor) {
		return valor == null ? false : valor;
	}
	
	public static Boolean defaultTrueIfNull(Boolean valor) {
		return valor == null ? true : valor;
	}

}
