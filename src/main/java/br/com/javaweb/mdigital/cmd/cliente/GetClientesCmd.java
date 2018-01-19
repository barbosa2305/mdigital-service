package br.com.javaweb.mdigital.cmd.cliente;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.javaweb.mdigital.dao.ClienteDAO;
import br.com.javaweb.mdigital.entity.Cliente;
import br.com.javaweb.mdigital.to.ClienteTO;

@Component
public class GetClientesCmd {
	
	@Autowired
	private ClienteDAO clienteDAO;
	
	public List<ClienteTO> get() {
		List<ClienteTO> clientesTO = new ArrayList<ClienteTO>();
		List<Cliente> clientes = clienteDAO.listAll();
		for (Cliente cliente : clientes) {
			clientesTO.add(new ClienteTO(cliente.getId(), cliente.getNome(), cliente.getTelefone(),
									cliente.getEmail(), cliente.getRendaBruta()));			
		}
		
		return clientesTO;
	}
}
