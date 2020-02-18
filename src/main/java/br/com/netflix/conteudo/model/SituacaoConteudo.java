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
public class SituacaoConteudo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private SituacaoIdentity situacaoIdentity;
	
	private Date data_desativacao;
}
