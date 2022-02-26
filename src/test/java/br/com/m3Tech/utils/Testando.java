package br.com.m3Tech.utils;

import br.com.m3Tech.exception.UtilsException;

public class Testando {
	
	private static final String SEQUENCIA = "!#abcdefghijklmnopqrstuvwxyz}:";


	public static void main(String[] args) throws UtilsException {
		

		String encrypt = CriptografiaUitl.encrypt(":pa!");
		
		System.out.println(encrypt);
		
		System.out.println(CriptografiaUitl.desencrypt(encrypt));
	}
	

}
