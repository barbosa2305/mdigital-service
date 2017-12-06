package br.com.javaweb.mdigital.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import br.com.javaweb.mdigital.cmd.IncluirClienteCmd;
import br.com.javaweb.mdigital.to.ClienteTO;

@Controller
@Path("/cliente")
public class ClienteService {
	
	@Autowired
	private IncluirClienteCmd incluirContatoCmd;
	
	@POST
	@Path("")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Transactional
	public ClienteTO incluirCliente(ClienteTO cliente) {
		return incluirContatoCmd.incluir(cliente);
	}
}