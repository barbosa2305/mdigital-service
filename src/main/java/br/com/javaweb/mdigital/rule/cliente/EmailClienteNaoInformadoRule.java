package br.com.javaweb.mdigital.rule.cliente;

import java.util.Optional;

import org.springframework.stereotype.Component;

import br.com.javaweb.mdigital.exception.cliente.EmailClienteNaoInformadoException;

@Component
public class EmailClienteNaoInformadoRule {

	public void valida(String email) {
		Optional.ofNullable(email).orElseThrow(() -> new EmailClienteNaoInformadoException("E-mail do cliente não foi informado."));
	}
}
