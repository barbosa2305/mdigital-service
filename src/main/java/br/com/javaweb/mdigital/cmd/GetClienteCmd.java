package br.com.javaweb.mdigital.cmd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
	
	public ClienteTO get(Integer idCliente){
		Cliente cliente = clienteDAO.getPorCodigo(idCliente);
		
		clienteNaoEncontradoRule.valida(cliente);
		
		return new ClienteTO(cliente.getId(), cliente.getNome(), cliente.getTelefone(),
				            cliente.getEmail(), cliente.getRendaBruta());
	}
}
