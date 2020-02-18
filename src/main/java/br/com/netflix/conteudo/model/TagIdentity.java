package br.com.netflix.conteudo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TagIdentity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "tag", unique = true)
	private String tag;
	
	@Column(name = "conteudo_codigo", unique = true)
	private Integer conteudo_codigo;
	
	public TagIdentity() {
		super();
	}

	public TagIdentity(String tag, Integer conteudo_codigo) {
		super();
		this.tag = tag;
		this.conteudo_codigo = conteudo_codigo;
	}
	
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public Integer getConteudo_codigo() {
		return conteudo_codigo;
	}
	public void setConteudo_codigo(Integer conteudo_codigo) {
		this.conteudo_codigo = conteudo_codigo;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((conteudo_codigo == null) ? 0 : conteudo_codigo.hashCode());
		result = prime * result + ((tag == null) ? 0 : tag.hashCode());
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
		TagIdentity other = (TagIdentity) obj;
		if (conteudo_codigo == null) {
			if (other.conteudo_codigo != null)
				return false;
		} else if (!conteudo_codigo.equals(other.conteudo_codigo))
			return false;
		if (tag == null) {
			if (other.tag != null)
				return false;
		} else if (!tag.equals(other.tag))
			return false;
		return true;
	}

}
