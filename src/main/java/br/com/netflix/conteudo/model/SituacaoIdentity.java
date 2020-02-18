package br.com.netflix.conteudo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SituacaoIdentity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "conteudo_codigo", unique = true)
	private Integer conteudo_codigo;
	
	@Column(name = "codigo_situacao", unique = true)	
	private Short codigo_situacao;
	
	@Column(name = "data_ativacao", unique = true)
	private Date data_ativacao;
			
	public SituacaoIdentity() {
		super();
	}
	public SituacaoIdentity(Integer conteudo_codigo, Short codigo_situacao, Date data_ativacao) {
		super();
		this.conteudo_codigo = conteudo_codigo;
		this.codigo_situacao = codigo_situacao;
		this.data_ativacao = data_ativacao;
	}
	public Integer getConteudo_codigo() {
		return conteudo_codigo;
	}
	public void setConteudo_codigo(Integer conteudo_codigo) {
		this.conteudo_codigo = conteudo_codigo;
	}
	public Short getCodigo_situacao() {
		return codigo_situacao;
	}
	public void setCodigo_situacao(Short codigo_situacao) {
		this.codigo_situacao = codigo_situacao;
	}
	public Date getData_ativacao() {
		return data_ativacao;
	}
	public void setData_ativacao(Date data_ativacao) {
		this.data_ativacao = data_ativacao;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo_situacao == null) ? 0 : codigo_situacao.hashCode());
		result = prime * result + ((conteudo_codigo == null) ? 0 : conteudo_codigo.hashCode());
		result = prime * result + ((data_ativacao == null) ? 0 : data_ativacao.hashCode());
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
		SituacaoIdentity other = (SituacaoIdentity) obj;
		if (codigo_situacao == null) {
			if (other.codigo_situacao != null)
				return false;
		} else if (!codigo_situacao.equals(other.codigo_situacao))
			return false;
		if (conteudo_codigo == null) {
			if (other.conteudo_codigo != null)
				return false;
		} else if (!conteudo_codigo.equals(other.conteudo_codigo))
			return false;
		if (data_ativacao == null) {
			if (other.data_ativacao != null)
				return false;
		} else if (!data_ativacao.equals(other.data_ativacao))
			return false;
		return true;
	}
	
	
	

}
