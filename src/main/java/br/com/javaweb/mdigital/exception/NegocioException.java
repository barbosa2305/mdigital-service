package br.com.javaweb.mdigital.exception;

public class NegocioException extends RuntimeException {
	private static final long serialVersionUID = -3310230740206130987L;

	public NegocioException(String message) {
		super(message);
	}
}
