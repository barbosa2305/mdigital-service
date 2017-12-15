package br.com.javaweb.mdigital.dao;

import static br.com.javaweb.mdigital.entity.QCliente.cliente;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mysema.query.jpa.hibernate.HibernateQuery;
import com.mysema.query.types.ConstructorExpression;

import br.com.javaweb.mdigital.entity.Cliente;
import br.com.javaweb.mdigital.infra.dao.BaseDAO;
import br.com.javaweb.mdigital.to.ClienteTO;

@Repository
public class ClienteDAO extends BaseDAO<Cliente> {

	public ClienteDAO() {
	}

	public List<ClienteTO> getClientesPorFaixaRenda(BigDecimal faixaRendaInicial, BigDecimal faixaRendaFinal) {
		HibernateQuery query = new HibernateQuery(getSession());
		
		// @formatter:off
		return query.from(cliente)
					.where(cliente.rendaBruta.between(faixaRendaInicial, faixaRendaFinal))
					.list(ConstructorExpression.create(ClienteTO.class, cliente.id,
																		cliente.nome,
																		cliente.telefone,
																		cliente.email,
																		cliente.rendaBruta));
		// @formatter:on
	}
}