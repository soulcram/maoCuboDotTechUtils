package br.com.m3Tech.exception;

public class BussinesException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public BussinesException(String msg){
        super(msg);
    }
	
	public BussinesException(String msg, Throwable cause){
        super(msg, cause);
    }

}
