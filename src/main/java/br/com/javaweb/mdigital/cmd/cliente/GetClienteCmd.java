package br.com.javaweb.mdigital.cmd.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.javaweb.mdigital.builder.ClienteTOBuilder;
import br.com.javaweb.mdigital.dao.ClienteDAO;
import br.com.javaweb.mdigital.entity.Cliente;
import br.com.javaweb.mdigital.rule.cliente.ClienteNaoEncontradoRule;
import br.com.javaweb.mdigital.to.ClienteTO;

@Component
public class GetClienteCmd {

	@Autowired
	private ClienteDAO clienteDAO;

	@Autowired
	private ClienteNaoEncontradoRule clienteNaoEncontradoRule;

	@Autowired
	private ClienteTOBuilder clienteTOBuilder;

	public ClienteTO get(Integer idCliente) {
		Cliente cliente = clienteDAO.getPorCodigo(idCliente);
		
		clienteNaoEncontradoRule.valida(cliente);
		
		return clienteTOBuilder.build(cliente);
	}
}
