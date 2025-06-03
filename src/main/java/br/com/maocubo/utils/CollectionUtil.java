package br.com.maocubo.utils;

import java.util.List;

public class CollectionUtil {    
	
	private CollectionUtil() {}
	
	public static boolean emptyOrNull(List<? extends Object> lista) {
		return lista == null || lista.isEmpty() ;
		
	}

}
