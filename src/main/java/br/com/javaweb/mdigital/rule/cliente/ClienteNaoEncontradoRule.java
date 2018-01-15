package br.com.javaweb.mdigital.rule.cliente;

import org.springframework.stereotype.Component;

import br.com.javaweb.mdigital.entity.Cliente;
import br.com.javaweb.mdigital.exception.cliente.ClienteNaoEncontradoException;

@Component
public class ClienteNaoEncontradoRule {

	public void valida(Cliente cliente) {
		if (cliente == null) {
			throw new ClienteNaoEncontradoException("Cliente não foi encontrado.");
		}
	}
}
