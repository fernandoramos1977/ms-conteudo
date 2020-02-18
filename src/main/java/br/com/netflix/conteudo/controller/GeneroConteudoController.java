package br.com.netflix.conteudo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.netflix.conteudo.model.Conteudo;
import br.com.netflix.conteudo.model.GeneroConteudo;
import br.com.netflix.conteudo.repository.GeneroConteudoRepository;

@RestController
@RequestMapping({"/generos"})
public class GeneroConteudoController {
	
	private GeneroConteudoRepository generoConteudoRepository;

	public GeneroConteudoController(GeneroConteudoRepository generoConteudoRepository) {
		super();
		this.generoConteudoRepository = generoConteudoRepository;
	}
	
	@GetMapping
	public List<GeneroConteudo> findall (){
		return generoConteudoRepository.findAll();
	}

}
