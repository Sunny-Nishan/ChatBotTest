package com.talespin.config.core;

public class InputDataException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String err;
	
	public InputDataException(String message) {
        super(message);
        
        this.err = message;
    }
  
    public InputDataException(String message, Throwable cause) {
        super(message, cause);
    }

   
    public InputDataException(Throwable cause) {
        super(cause);
    }

    
    protected InputDataException(String message, Throwable cause,
                        boolean enableSuppression,
                        boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
