package br.com.m3Tech.exception;

public class UtilsException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public UtilsException(String msg){
        super(msg);
    }
	
	public UtilsException(String msg, Throwable cause){
        super(msg, cause);
    }

}
