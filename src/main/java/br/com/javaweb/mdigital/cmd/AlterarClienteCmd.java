package br.com.javaweb.mdigital.cmd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.javaweb.mdigital.dao.ClienteDAO;
import br.com.javaweb.mdigital.entity.Cliente;
import br.com.javaweb.mdigital.rule.EmailFormatoInvalidoRule;
import br.com.javaweb.mdigital.rule.cliente.ClienteNaoEncontradoRule;
import br.com.javaweb.mdigital.rule.cliente.EmailClienteNaoInformadoRule;
import br.com.javaweb.mdigital.rule.cliente.NomeClienteNaoInformadoRule;
import br.com.javaweb.mdigital.rule.cliente.RendaClienteNaoInformadaRule;
import br.com.javaweb.mdigital.rule.cliente.TelefoneClienteNaoInformadoRule;
import br.com.javaweb.mdigital.to.ClienteTO;

@Component
public class AlterarClienteCmd {
	
	@Autowired
	private ClienteDAO clienteDAO;
	
	@Autowired
	private ClienteNaoEncontradoRule clienteNaoEncontradoRule;
	
	@Autowired
	private NomeClienteNaoInformadoRule nomeClienteNaoInformadoRule;
	
	@Autowired
	private EmailClienteNaoInformadoRule emailClienteNaoInformadoRule;
	
	@Autowired
	private EmailFormatoInvalidoRule emailFormatoInvalidoRule;
	
	@Autowired
	private TelefoneClienteNaoInformadoRule telefoneClienteNaoInformadoRule;
	
	@Autowired
	private RendaClienteNaoInformadaRule rendaClienteNaoInformadaRule;
	
	public ClienteTO alterar(Integer idCliente, ClienteTO clienteTO) {
		Cliente cliente = clienteDAO.getPorCodigo(idCliente);
		
		clienteNaoEncontradoRule.valida(cliente);
		nomeClienteNaoInformadoRule.valida(clienteTO.getNome());
		emailClienteNaoInformadoRule.valida(clienteTO.getEmail());
		emailFormatoInvalidoRule.valida(clienteTO.getEmail());
		telefoneClienteNaoInformadoRule.valida(clienteTO.getTelefone());
		rendaClienteNaoInformadaRule.valida(clienteTO.getRendaBruta());	
		
		cliente.setNome(clienteTO.getNome());
		cliente.setTelefone(clienteTO.getTelefone());
		cliente.setEmail(clienteTO.getEmail());
		cliente.setRendaBruta(clienteTO.getRendaBruta());
		clienteDAO.update(cliente);
		
		return new ClienteTO(cliente.getId(), cliente.getNome(), cliente.getTelefone(),
							cliente.getEmail(), cliente.getRendaBruta());
	}
}
