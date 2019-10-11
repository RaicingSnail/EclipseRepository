package com.test4;

public class AddException extends Exception {
	Object o;
	public Object getO() {
		return o;
	}

	public AddException() {
		super();
	}

	public AddException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public AddException(String message, Throwable cause, Object o1) {
		super(message, cause);
		this.o = o1;
	}

	public AddException(String message) {
		super(message);
	}

	public AddException(Throwable cause) {
		super(cause);
	}
	
}
