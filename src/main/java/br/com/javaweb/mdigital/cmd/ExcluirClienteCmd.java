package br.com.javaweb.mdigital.cmd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.javaweb.mdigital.dao.ClienteDAO;
import br.com.javaweb.mdigital.entity.Cliente;

@Component
public class ExcluirClienteCmd {
	
	@Autowired
	private ClienteDAO clienteDAO;

	public void excluir(Integer idCliente) {
		Cliente cliente = clienteDAO.getPorCodigo(idCliente);
		clienteDAO.delete(cliente);
	}
}