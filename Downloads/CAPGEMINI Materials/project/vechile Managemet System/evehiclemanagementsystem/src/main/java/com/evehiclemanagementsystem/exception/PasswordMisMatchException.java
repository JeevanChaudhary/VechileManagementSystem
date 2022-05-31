package com.evehiclemanagementsystem.exception;

public class PasswordMisMatchException extends RuntimeException {
	public PasswordMisMatchException(String msg) {
		super(msg);
	}

}