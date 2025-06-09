package br.com.maocubo.tech.utils;

public class HashUtils {
	
	private HashUtils() {};
	
	public static boolean validarHash(String valor) {
		String[] split = valor.split(";");
		
		if(!(split.length > 0)) {
			return false;
		}
		
		if("soulcram".equals(split[0])) {
			return true;
		}
		
		return false;
	}
	

}
