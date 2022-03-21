package br.com.m3Tech.utils;

import br.com.correios.bsb.sigep.master.bean.cliente.AtendeClienteProxy;
import br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP;
import br.com.m3Tech.dto.EnderecoDto;

public class CepUtil {    
	
	private CepUtil() {}
	
	public static EnderecoDto getEnderecoByCep(String cep) {
		
		EnderecoDto endereco = new EnderecoDto();
		endereco.setCep(cep);
		
		try {
			EnderecoERP correios = new AtendeClienteProxy().consultaCEP(cep);
			
			endereco.setLogradouro(correios.getEnd());
			endereco.setBairro(correios.getBairro());
			endereco.setCidade(correios.getCidade());
			endereco.setEstado(correios.getUf());
			
		} catch (Exception e) {
			e.printStackTrace();
		} 

		return endereco;
		
	}

}
