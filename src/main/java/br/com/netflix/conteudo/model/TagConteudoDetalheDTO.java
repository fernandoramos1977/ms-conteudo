package br.com.netflix.conteudo.model;

public class TagConteudoDetalheDTO {
	
	private String tag;
	private Integer conteudoCodigo;
	private String titulo;
	
	public TagConteudoDetalheDTO() {
		super();
	}

	public TagConteudoDetalheDTO(String tag, Integer conteudoCodigo, String titulo) {
		super();
		this.tag = tag;
		this.conteudoCodigo = conteudoCodigo;
		this.titulo = titulo;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public Integer getConteudoCodigo() {
		return conteudoCodigo;
	}

	public void setConteudoCodigo(Integer conteudoCodigo) {
		this.conteudoCodigo = conteudoCodigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	
	
}
