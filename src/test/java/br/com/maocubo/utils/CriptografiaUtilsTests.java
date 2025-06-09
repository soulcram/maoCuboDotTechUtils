package br.com.maocubo.utils;

import br.com.maocubo.tech.exception.UtilsException;
import br.com.maocubo.tech.utils.CriptografiaUitl;
import junit.framework.TestCase;

public class CriptografiaUtilsTests extends TestCase{

    public void testarExtremidade() throws UtilsException {
    	
    	String hash = "}!";
    	
    	String encrypt = CriptografiaUitl.encrypt(hash);
    	
    	System.out.println(encrypt);

    	String desencrypt = CriptografiaUitl.desencrypt(encrypt);

        System.out.println(desencrypt);
        assertTrue(desencrypt.equals(hash));
    }
	
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
