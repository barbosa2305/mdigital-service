package br.com.javaweb.mdigital.cmd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.javaweb.mdigital.dao.ClienteDAO;
import br.com.javaweb.mdigital.entity.Cliente;
import br.com.javaweb.mdigital.to.ClienteTO;

@Component
public class IncluirClienteCmd {
	
	@Autowired
	private ClienteDAO clienteDAO;

	public ClienteTO incluir(ClienteTO clienteTO) {
		Cliente cliente = new Cliente();
		cliente.setNome(clienteTO.getNome());
		cliente.setTelefone(clienteTO.getTelefone());
		cliente.setEmail(clienteTO.getEmail());
		cliente.setRendaBruta(clienteTO.getRendaBruta());
		clienteDAO.insert(cliente);
		return new ClienteTO(cliente.getId(), cliente.getNome(), cliente.getTelefone(),
							cliente.getEmail(), cliente.getRendaBruta());
	}
	
}