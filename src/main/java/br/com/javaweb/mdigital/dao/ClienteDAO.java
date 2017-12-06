package br.com.javaweb.mdigital.dao;

import org.springframework.stereotype.Repository;

import br.com.javaweb.mdigital.entity.Cliente;
import br.com.javaweb.mdigital.infra.dao.BaseDAO;

@Repository
public class ClienteDAO extends BaseDAO<Cliente> {

	public ClienteDAO() {
	}
}