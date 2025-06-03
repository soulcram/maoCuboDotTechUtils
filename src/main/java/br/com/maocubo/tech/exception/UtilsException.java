package br.com.maocubo.tech.exception;

public class UtilsException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public UtilsException(String msg){
        super(msg);
    }
	
	public UtilsException(String msg, Throwable cause){
        super(msg, cause);
    }

}
