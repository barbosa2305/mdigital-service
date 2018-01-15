package br.com.javaweb.mdigital.rule.cliente;

import org.springframework.stereotype.Component;

import br.com.javaweb.mdigital.exception.cliente.EmailClienteNaoInformadoException;

@Component
public class EmailClienteNaoInformadoRule {

	public void valida(String email) {
		if (email.isEmpty()) {
			throw new EmailClienteNaoInformadoException("E-mail do cliente não foi informado.");
		}
	}
}
