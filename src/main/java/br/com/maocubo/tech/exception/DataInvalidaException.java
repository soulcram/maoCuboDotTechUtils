package br.com.maocubo.tech.exception;

public class DataInvalidaException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public DataInvalidaException(String msg){
        super(msg);
    }
	
	public DataInvalidaException(String msg, Throwable cause){
        super(msg, cause);
    }

}
