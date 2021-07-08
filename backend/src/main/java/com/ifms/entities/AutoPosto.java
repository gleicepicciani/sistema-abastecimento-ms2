package com.ifms.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;

import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;


@Entity
@Table(name = "tb_autoposto") //nome da tabela no banco
public class AutoPosto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nome_fantasia")
	private String nomeFantasia;
	private String telefone;
	private String email;
	@Column(name = "cnpj")
	private String CNPJ;
	private String endereco;
		
	//muitos pra um autopostoxcidade
	@ManyToOne
	@JoinColumn(name = "id_cidade_fk")
	private Cidade cidade;
			
	public AutoPosto() {		
	}
	
	public AutoPosto(Long id, String nomeFantasia, String telefone, String email, String cNPJ, String endereco, Cidade cidade) {
		this.id = id;
		this.nomeFantasia = nomeFantasia;
		this.telefone = telefone;
		this.email = email;
		CNPJ = cNPJ;
		this.endereco = endereco;
		this.cidade = cidade;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
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
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
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
		AutoPosto other = (AutoPosto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nomeFantasia == null) {
			if (other.nomeFantasia != null)
				return false;
		} else if (!nomeFantasia.equals(other.nomeFantasia))
			return false;
		return true;
	}
}