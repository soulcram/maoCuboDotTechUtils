package br.com.maocubo.tech.exception.utils;

import java.util.List;

public class CollectionUtil {    
	
	private CollectionUtil() {}
	
	public static boolean emptyOrNull(List<? extends Object> lista) {
		return lista == null || lista.isEmpty() ;
		
	}

}
