package com.knorex.helper;
import java.lang.*;

public class ElementException extends Throwable {
	public ElementException() {
		super();
	}
	
	public ElementException(String message) {
		super(message);
	}
	
	public ElementException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public ElementException(Throwable cause) {
		super(cause);
	}
	
	public ElementException(String message, Throwable cause, boolean enableSuppression, boolean writeableStackTrace) {
		super(message, cause, enableSuppression, writeableStackTrace);
	}
}
