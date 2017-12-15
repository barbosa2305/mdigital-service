package br.com.javaweb.mdigital.cmd;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.javaweb.mdigital.dao.ClienteDAO;
import br.com.javaweb.mdigital.to.ClienteTO;

@Component
public class GetClientesPorFaixaRendaCmd {
	
	@Autowired
	private ClienteDAO clienteDAO;
	
	public List<ClienteTO> get(BigDecimal faixaRendaInicial, BigDecimal faixaRendaFinal) {
		
		return clienteDAO.getClientesPorFaixaRenda(faixaRendaInicial, faixaRendaFinal);
	}
}