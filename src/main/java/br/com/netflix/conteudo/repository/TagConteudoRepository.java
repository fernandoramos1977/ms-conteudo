package br.com.netflix.conteudo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.netflix.conteudo.model.TagConteudo;
import br.com.netflix.conteudo.model.TagIdentity;

@Repository
public interface TagConteudoRepository extends JpaRepository<TagConteudo, TagIdentity>{


	@Query(value = "select p.* from tag_conteudo p where p.tag like ?1%", nativeQuery = true)
    List<TagConteudo> buscarConteudoPorTag(String tag);

/*	
	@Query(value = "select p.tag, p.conteudo_codigo, q.titulo from tag_conteudo p, conteudo q where p.conteudo_codigo = q.codigo And p.tag like ?1%", nativeQuery = true)
	List<TagConteudoDetalheDTO> buscarConteudoPorTag(String tag);
*/
}
