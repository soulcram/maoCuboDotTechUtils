package br.com.m3Tech.utils;

import java.math.BigDecimal;

public class NumericUtils {
	
	private NumericUtils() {}
	
	public static boolean isNull(BigDecimal valor) {
		return valor == null;
	}
	
	public static Integer getOnlyNumericsOfString(String valor) {
		return Integer.valueOf(valor.replaceAll("[^0-9]", ""));
	}

}
