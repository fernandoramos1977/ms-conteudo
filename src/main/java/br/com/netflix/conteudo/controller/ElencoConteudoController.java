package br.com.netflix.conteudo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.netflix.conteudo.model.Conteudo;
import br.com.netflix.conteudo.model.ElencoConteudo;
import br.com.netflix.conteudo.repository.ElencoConteudoRepository;

@RestController
@RequestMapping({"/elencos-conteudos"})
public class ElencoConteudoController {
	
	private ElencoConteudoRepository elencoConteudoRepository;

	public ElencoConteudoController(ElencoConteudoRepository elencoConteudoRepository) {
		super();
		this.elencoConteudoRepository = elencoConteudoRepository;
	}
	
	@GetMapping
	public List<ElencoConteudo> findall (){
		return elencoConteudoRepository.findAll();
	}

}
