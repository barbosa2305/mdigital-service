package br.com.javaweb.mdigital.builder;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.javaweb.mdigital.entity.Cliente;
import br.com.javaweb.mdigital.to.ClienteTO;

@Component
public class ClienteTOBuilder {

	public ClienteTO build(Cliente cliente) {
		// @formatter:off
		return new ClienteTO(cliente.getId(), cliente.getNome(), cliente.getTelefone(),
	            			 cliente.getEmail(), cliente.getRendaBruta());
		// @formatter:on
	}
	
	public List<ClienteTO> build(List<Cliente> clientes) {
		List<ClienteTO> clientesTO = new ArrayList<ClienteTO>();
		
		// @formatter:off
		clientes.stream()
				.forEach(cliente -> clientesTO.add(build(cliente)));
		// @formatter:on
		
		return clientesTO;
	}
}
