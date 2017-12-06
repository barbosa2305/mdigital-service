package br.com.javaweb.mdigital.to;

import java.math.BigDecimal;

public class ClienteTO {

	private Integer id;
	private String nome;
	private String telefone;
	private String email;
	private BigDecimal rendaBruta;
	
	public ClienteTO() {
	}

	public ClienteTO(Integer id, String nome, String telefone, String email, BigDecimal rendaBruta) {
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

	@Override
	public String toString() {
		return "ClienteTO [id=" + id + ", nome=" + nome + ", telefone=" + telefone + ", email=" + email + ", rendaBruta=" + rendaBruta + "]";
	}
}