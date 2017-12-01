package br.com.javaweb.mdigital.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="dbo", name="CLIENTE")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCliente")
	private Integer id;
	
	@Column(name = "nmCliente", nullable = false, length = 200)
	private String nome;
	
	@Column(name = "nrTelefone", nullable = false, length = 20)
	private String telefone;
	
	@Column(name = "dsEmail", nullable = false, length = 100)
	private String email;
	
	@Column(name = "vlRendaBruta", nullable = false, precision = 15, scale = 2)
	private BigDecimal rendaBruta;
	
	public Cliente() {
	}

	public Cliente(Integer id, String nome, String telefone, String email, BigDecimal rendaBruta) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.rendaBruta = rendaBruta;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigDecimal getRendaBruta() {
		return rendaBruta;
	}

	public void setRendaBruta(BigDecimal rendaBruta) {
		this.rendaBruta = rendaBruta;
	}
}