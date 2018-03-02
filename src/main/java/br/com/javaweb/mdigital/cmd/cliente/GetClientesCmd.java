package br.com.javaweb.mdigital.cmd.cliente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.javaweb.mdigital.builder.ClienteTOBuilder;
import br.com.javaweb.mdigital.dao.ClienteDAO;
import br.com.javaweb.mdigital.to.ClienteTO;

@Component
public class GetClientesCmd {

	@Autowired
	private ClienteDAO clienteDAO;

	@Autowired
	private ClienteTOBuilder clienteTOBuilder;

	public List<ClienteTO> get() {
		return clienteTOBuilder.build(clienteDAO.listAll());
	}
}
