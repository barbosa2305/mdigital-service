package br.com.javaweb.mdigital.exception.cliente;

import br.com.javaweb.mdigital.exception.NegocioException;

public class TelefoneClienteNaoInformadoException extends NegocioException {
	private static final long serialVersionUID = 1L;

	public TelefoneClienteNaoInformadoException(String message) {
		super(message);
	}
}
