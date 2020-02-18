package br.com.netflix.conteudo.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.netflix.conteudo.model.Conteudo;
import br.com.netflix.conteudo.repository.ConteudoRepository;

@RestController
@RequestMapping({"/conteudos"})
public class ConteudoController {
	
	private ConteudoRepository conteudoRepository;
	
	ConteudoController(ConteudoRepository conteudoRepository) {
		this.conteudoRepository = conteudoRepository;
	}
	
	@GetMapping
	public List<Conteudo> findall (){
		return conteudoRepository.findAll();
	}

	@GetMapping(path = {"/detalha-conteudo/{codigo}"})
	public ResponseEntity<Conteudo> findById(@PathVariable int codigo){
	   return conteudoRepository.findById(codigo)
	           .map(record -> ResponseEntity.ok().body(record))
	           .orElse(ResponseEntity.notFound().build());
	} 
	
	
	@GetMapping(path = {"/lista-conteudos-genero/{genero_conteudo_codigo}"})
	public List<Conteudo> findConteudosByGeneroConteudoEquals(@PathVariable short genero_conteudo_codigo){
	
		List<Conteudo> listaConteudo = conteudoRepository.buscarConteudoPorGenero(genero_conteudo_codigo);
		return listaConteudo;       
	   
	}	
}
