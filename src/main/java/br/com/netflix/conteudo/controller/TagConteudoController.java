package br.com.netflix.conteudo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.netflix.conteudo.model.TagConteudo;
import br.com.netflix.conteudo.repository.TagConteudoRepository;

@RestController
@RequestMapping({"/tags-conteudos"})
public class TagConteudoController {
	
	private TagConteudoRepository tagConteudoRepository;

	public TagConteudoController(TagConteudoRepository tagConteudoRepository) {
		super();
		this.tagConteudoRepository = tagConteudoRepository;
	}
	
	@GetMapping
	public List<TagConteudo> findall (){
		return tagConteudoRepository.findAll();
	}

	@GetMapping(path = {"/lista-conteudos-tag/{tag}"})
	public List<TagConteudo> buscaConteudoPorTag(@PathVariable String tag){
	
		List<TagConteudo> listaTagConteudo = tagConteudoRepository.buscarConteudoPorTag(tag);
		return listaTagConteudo;       
	   
	}
}
