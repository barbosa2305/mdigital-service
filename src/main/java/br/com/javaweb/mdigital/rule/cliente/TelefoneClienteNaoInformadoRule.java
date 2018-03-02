package br.com.javaweb.mdigital.rule.cliente;

import java.util.Optional;

import org.springframework.stereotype.Component;

import br.com.javaweb.mdigital.exception.cliente.TelefoneClienteNaoInformadoException;

@Component
public class TelefoneClienteNaoInformadoRule {

	public void valida(String telefone) {
		Optional.ofNullable(telefone).orElseThrow(() -> new TelefoneClienteNaoInformadoException("Telefone do cliente não foi informado."));
	}
}
