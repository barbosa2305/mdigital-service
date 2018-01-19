package br.com.javaweb.mdigital.service;

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

import br.com.javaweb.mdigital.cmd.maladireta.AlterarMalaDiretaCmd;
import br.com.javaweb.mdigital.cmd.maladireta.ExcluirMalaDiretaCmd;
import br.com.javaweb.mdigital.cmd.maladireta.GetMalaDiretaCmd;
import br.com.javaweb.mdigital.cmd.maladireta.GetMalasDiretasCmd;
import br.com.javaweb.mdigital.cmd.maladireta.IncluirMalaDiretaCmd;
import br.com.javaweb.mdigital.to.MalaDiretaTO;

@Controller
@Path("/maladireta")
public class MalaDiretaService {

	@Autowired
	private GetMalasDiretasCmd getMalasDiretasCmd;
	
	@Autowired
	private GetMalaDiretaCmd getMalaDiretaCmd;
	
	@Autowired
	private IncluirMalaDiretaCmd incluirMalaDiretaCmd; 
	
	@Autowired
	private AlterarMalaDiretaCmd alterarMalaDiretaCmd; 
	
	@Autowired
	private ExcluirMalaDiretaCmd excluirMalaDiretaCmd;
	
	@GET
	@Path("")
	@Produces(MediaType.APPLICATION_JSON)
	@Transactional
	public List<MalaDiretaTO> getMalasDiretas() {
		return getMalasDiretasCmd.get();
	}
	
	@GET
	@Path("/{idMalaDireta}")
	@Produces(MediaType.APPLICATION_JSON)
	@Transactional
	public MalaDiretaTO getMalaDireta(@PathParam("idMalaDireta") Integer idMalaDireta){
		return getMalaDiretaCmd.get(idMalaDireta);
	}
	
	@POST
	@Path("")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Transactional
	public MalaDiretaTO incluirMalaDireta(MalaDiretaTO malaDireta) {
		return incluirMalaDiretaCmd.incluir(malaDireta);
	}
	
	@PUT
	@Path("/{idMalaDireta}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Transactional
	public MalaDiretaTO alterarMalaDireta(@PathParam("idMalaDireta") Integer idMalaDireta,
												MalaDiretaTO malaDiretaTO) {
		return alterarMalaDiretaCmd.alterar(idMalaDireta, malaDiretaTO);
	}
	
	@DELETE
	@Path("/{idMalaDireta}")
	@Transactional
	public void excluirMalaDireta(@PathParam("idMalaDireta") Integer idMalaDireta) {
		excluirMalaDiretaCmd.excluir(idMalaDireta);
	}
}
