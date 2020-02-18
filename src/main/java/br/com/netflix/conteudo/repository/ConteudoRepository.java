package br.com.netflix.conteudo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.netflix.conteudo.model.Conteudo;

@Repository
public interface ConteudoRepository extends JpaRepository<Conteudo, Integer> {
	
	@Query(value = "select p.* from conteudo p where p.genero_conteudo_codigo = ?1", nativeQuery = true)
    List<Conteudo> buscarConteudoPorGenero(Short codigoGenero);

}




