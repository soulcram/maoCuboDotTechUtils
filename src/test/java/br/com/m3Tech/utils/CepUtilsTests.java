package br.com.m3Tech.utils;

import br.com.m3Tech.dto.EnderecoDto;
import br.com.m3Tech.exception.UtilsException;
import junit.framework.TestCase;

public class CepUtilsTests extends TestCase{

    public void testarGetEnderecoBycep() throws UtilsException{
    	
    	EnderecoDto enderecoByCep = CepUtil.getEnderecoByCep("04842300");
    	
    	System.out.println(enderecoByCep.getLogradouro());
    	
    	assertTrue("Rua Maria Celestina Fraga".equals(enderecoByCep.getLogradouro()));
    }
	

}
