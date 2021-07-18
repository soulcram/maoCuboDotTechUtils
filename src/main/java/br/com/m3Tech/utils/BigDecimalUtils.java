package br.com.m3Tech.utils;

import java.math.BigDecimal;

public class BigDecimalUtils {
	
	private BigDecimalUtils() {}
	
	public static boolean isNull(BigDecimal valor) {
		return valor == null;
	}
	
	public static BigDecimal ifNullThenZero(BigDecimal valor) {
		
		if(isNull(valor)) {
			return BigDecimal.ZERO;
		}else {
			return valor;
		}
	}

}
