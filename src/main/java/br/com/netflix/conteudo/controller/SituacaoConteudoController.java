package br.com.netflix.conteudo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.netflix.conteudo.model.SituacaoConteudo;
import br.com.netflix.conteudo.repository.SituacaoConteudoRepository;

@RestController
@RequestMapping({"/situacao-conteudos"})
public class SituacaoConteudoController {

	private SituacaoConteudoRepository situacaoConteudoRepository;

	public SituacaoConteudoController(SituacaoConteudoRepository situacaoConteudoRepository) {
		super();
		this.situacaoConteudoRepository = situacaoConteudoRepository;
	}
	
	@GetMapping
	public List<SituacaoConteudo> findall (){
		return situacaoConteudoRepository.findAll();
	}
}
