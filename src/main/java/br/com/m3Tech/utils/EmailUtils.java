package br.com.m3Tech.utils;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

public class EmailUtils {
	
	private EmailUtils() {};
	
	public static boolean validarEmail(String valor) {
		
	    boolean result = true;
	    try {
	        InternetAddress emailAddr = new InternetAddress(valor);
	        emailAddr.validate();
	    } catch (AddressException ex) {
	        result = false;
	    }
	    return result;
	}


}
