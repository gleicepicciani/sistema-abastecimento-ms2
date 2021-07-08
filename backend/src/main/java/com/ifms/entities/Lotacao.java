package com.ifms.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;


@Entity
@Table(name = "tb_lotacao") //nome da tabela no banco
public class Lotacao implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricao;	
	private String email;
	private String site;
	private String telefone;
	private String endereco;
	@ManyToOne
	@JoinColumn(name = "id_cidade_fk")
	private Cidade cidade;
	@ManyToMany
	@JoinTable(name = "tb_lotacao_veiculo", 
		joinColumns = @JoinColumn(name = "lotacao_id"),
		inverseJoinColumns = @JoinColumn(name = "veiculo_id"))
	Set<Veiculo> veiculos = new HashSet<>();
	
	public Lotacao() {}

	public Lotacao(Long id, String descricao, String email, String site, String telefone, String endereco,
			Cidade cidade) {
		this.id = id;
		this.descricao = descricao;
		this.email = email;
		this.site = site;
		this.telefone = telefone;
		this.endereco = endereco;
		this.cidade = cidade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Set<Veiculo> getVeiculos() {
		return veiculos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lotacao other = (Lotacao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}	
}