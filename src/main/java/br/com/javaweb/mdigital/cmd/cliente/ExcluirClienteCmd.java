package br.com.javaweb.mdigital.cmd.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.javaweb.mdigital.dao.ClienteDAO;
import br.com.javaweb.mdigital.entity.Cliente;
import br.com.javaweb.mdigital.rule.cliente.ClienteNaoEncontradoRule;

@Component
public class ExcluirClienteCmd {
	
	@Autowired
	private ClienteDAO clienteDAO;
	
	@Autowired
	private ClienteNaoEncontradoRule clienteNaoEncontradoRule;

	public void excluir(Integer idCliente) {
		Cliente cliente = clienteDAO.getPorCodigo(idCliente);
		
		clienteNaoEncontradoRule.valida(cliente);
		
		clienteDAO.delete(cliente);
	}
}
