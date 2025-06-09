package br.com.maocubo.tech.exception.dto;

public class EnderecoDto {
	
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	private String logradouro;
	private String cep;
	private String bairro;
	private String cidade;
	private String estado;
	
	public EnderecoDto() {
	}
	
	public EnderecoDto(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getLogradouro() {
		return logradouro;
	}



	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}



	public String getBairro() {
		return bairro;
	}



	public void setBairro(String bairro) {
		this.bairro = bairro;
	}



	public String getCidade() {
		return cidade;
	}



	public void setCidade(String cidade) {
		this.cidade = cidade;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	public String getCep() {
		return cep;
	}



	public void setCep(String cep) {
		this.cep = cep.replaceAll("-","");
	}
}
