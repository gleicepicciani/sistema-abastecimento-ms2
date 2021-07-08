package com.ifms.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;


@Entity
@Table(name = "tb_marca") //nome tabela banco
public class Marca implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	private String descricao;
	
	//um pra mtos
	@OneToMany(mappedBy = "marca")
	private List<Modelo> modelos;	
	
	public Marca() {}

	public Marca(Long id, String descricao) {
		this.id = id;
		this.descricao = descricao;		
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

	public List<Modelo> getModelos() {
		return modelos;
	}

	public void setModelos(List<Modelo> modelos) {
		this.modelos = modelos;
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
		Marca other = (Marca) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}