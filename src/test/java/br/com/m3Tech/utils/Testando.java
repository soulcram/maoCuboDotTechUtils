package br.com.m3Tech.utils;

import br.com.m3Tech.exception.UtilsException;

public class Testando {
	
	private static final String SEQUENCIA = "!#abcdefghijklmnopqrstuvwxyz}:";


	public static void main(String[] args) throws UtilsException {
		
		try {
		
		for(int i = 0 ; i < 1000; i++) {

			System.out.println(i);
			
			String encrypt = CriptografiaUitl.encrypt("admin");
			
			System.out.println(encrypt);
			
			System.out.println(CriptografiaUitl.desencrypt(encrypt));
		}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	

}
