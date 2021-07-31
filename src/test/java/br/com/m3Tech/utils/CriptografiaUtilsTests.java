package br.com.m3Tech.utils;

import br.com.m3Tech.exception.UtilsException;
import junit.framework.TestCase;

public class CriptografiaUtilsTests extends TestCase{

	
    public void testarCriptografiaSenha() throws UtilsException{
    	
    	String hash = "P@r@tud0";
    	
    	String encrypt = CriptografiaUitl.encrypt(hash);
    	
    	System.out.println(encrypt);

    	String desencrypt = CriptografiaUitl.desencrypt(encrypt);

        System.out.println(desencrypt);
        assertTrue(desencrypt.equals(hash));
    }
    
    public void testarCriptografiaEmail() throws UtilsException{
    		
    	String hash = "mpwmnw@gmail.com";
    	
    	String encrypt = CriptografiaUitl.encrypt(hash);
    	
    	System.out.println(encrypt);

    	String desencrypt = CriptografiaUitl.desencrypt(encrypt);

        System.out.println(desencrypt);
        assertTrue(desencrypt.equals(hash));
    }
    
    public void testarCriptografiaHash() throws UtilsException {
    	String hash = "soulcram;mpwmnw@gmail.com;P@r@tud0";
    	
    	String encrypt = CriptografiaUitl.encrypt(hash);
    	
    	System.out.println(encrypt);

    	String desencrypt = CriptografiaUitl.desencrypt(encrypt);

        System.out.println(desencrypt);
        assertTrue(desencrypt.equals(hash));
    }

}
