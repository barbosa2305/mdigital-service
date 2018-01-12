package br.com.javaweb.mdigital.exception;

public class EmailFormatoInvalidoException extends NegocioException {
	private static final long serialVersionUID = 1L;

	public EmailFormatoInvalidoException(String message) {
		super(message);
	}
}
