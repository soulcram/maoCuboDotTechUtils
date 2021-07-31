package br.com.m3Tech.utils;

import java.util.Random;
import java.util.stream.IntStream;

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
	
	public static Integer random(Integer valorMin, Integer valorMax) {
		
		Random random = new Random();
		
		int nextInt = random.nextInt(valorMax);
		
		if(nextInt < valorMin) {
			nextInt += valorMin;
		}
		
		return nextInt;
		
	}


}
