package br.com.netflix.conteudo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.netflix.conteudo.model.SituacaoConteudo;
import br.com.netflix.conteudo.model.SituacaoIdentity;

@Repository
public interface SituacaoConteudoRepository extends JpaRepository<SituacaoConteudo, SituacaoIdentity>{

}
