package br.com.netflix.conteudo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Conteudo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	
	private Short genero_conteudo_codigo;
	private String titulo;
	private Short tipo;
	private Date data_lancamento;
	private Short classificacao_indicativa;
	private Short duracao;
	private String descricao;
}

