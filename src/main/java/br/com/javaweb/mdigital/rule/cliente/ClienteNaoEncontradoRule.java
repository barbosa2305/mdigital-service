package br.com.javaweb.mdigital.rule.cliente;

import java.util.Optional;

import org.springframework.stereotype.Component;

import br.com.javaweb.mdigital.entity.Cliente;
import br.com.javaweb.mdigital.exception.cliente.ClienteNaoEncontradoException;

@Component
public class ClienteNaoEncontradoRule {

	public void valida(Cliente cliente) {
		Optional.ofNullable(cliente).orElseThrow(() -> new ClienteNaoEncontradoException("Cliente não foi encontrado."));
	}
}
