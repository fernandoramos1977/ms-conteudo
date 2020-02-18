package br.com.netflix.conteudo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.netflix.conteudo.model.ElencoConteudo;

@Repository
public interface ElencoConteudoRepository extends JpaRepository<ElencoConteudo, Short> {

}
