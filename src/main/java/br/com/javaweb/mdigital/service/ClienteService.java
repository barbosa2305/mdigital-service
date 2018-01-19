package br.com.javaweb.mdigital.service;

import java.math.BigDecimal;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import br.com.javaweb.mdigital.cmd.cliente.AlterarClienteCmd;
import br.com.javaweb.mdigital.cmd.cliente.ExcluirClienteCmd;
import br.com.javaweb.mdigital.cmd.cliente.GetClienteCmd;
import br.com.javaweb.mdigital.cmd.cliente.GetClientesCmd;
import br.com.javaweb.mdigital.cmd.cliente.GetClientesPorFaixaRendaCmd;
import br.com.javaweb.mdigital.cmd.cliente.IncluirClienteCmd;
import br.com.javaweb.mdigital.to.ClienteTO;

@Controller
@Path("/cliente")
public class ClienteService {
	
	@Autowired
	private GetClientesCmd getClientesCmd;
	
	@Autowired
	private GetClienteCmd getClienteCmd;
	
	@Autowired
	private GetClientesPorFaixaRendaCmd getClientesPorFaixaRendaCmd; 
	
	@Autowired
	private IncluirClienteCmd incluirClienteCmd;
	
	@Autowired
	private AlterarClienteCmd alterarClienteCmd;
	
	@Autowired
	private ExcluirClienteCmd excluirClienteCmd; 
	
	@GET
	@Path("")
	@Produces(MediaType.APPLICATION_JSON)
	@Transactional
	public List<ClienteTO> getClientes() {
		return getClientesCmd.get();
	}
	
	@GET
	@Path("/{idCliente}")
	@Produces(MediaType.APPLICATION_JSON)
	@Transactional
	public ClienteTO getCliente(@PathParam("idCliente") Integer idCliente){
		return getClienteCmd.get(idCliente);
	}
	
	@GET
	@Path("/faixarenda/{rendaInicial}/{rendaFinal}")
	@Produces(MediaType.APPLICATION_JSON)
	@Transactional
	public List<ClienteTO> getClientesPorFaixaRenda(@PathParam("rendaInicial") BigDecimal faixaRendaInicial,
													@PathParam("rendaFinal") BigDecimal faixaRendaFinal){
		return getClientesPorFaixaRendaCmd.get(faixaRendaInicial, faixaRendaFinal);
	}
	
	@POST
	@Path("")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Transactional
	public ClienteTO incluirCliente(ClienteTO cliente) {
		return incluirClienteCmd.incluir(cliente);
	}
	
	@PUT
	@Path("/{idCliente}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Transactional
	public ClienteTO alterarCliente(@PathParam("idCliente") Integer idCliente,
										ClienteTO clienteTO) {
		return alterarClienteCmd.alterar(idCliente, clienteTO);
	}
	
	@DELETE
	@Path("/{idCliente}")
	@Transactional
	public void excluirCliente(@PathParam("idCliente") Integer idCliente) {
		excluirClienteCmd.excluir(idCliente);
	}
}