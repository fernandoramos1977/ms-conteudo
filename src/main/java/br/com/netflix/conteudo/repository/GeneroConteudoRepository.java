package br.com.netflix.conteudo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.netflix.conteudo.model.GeneroConteudo;

@Repository
public interface GeneroConteudoRepository extends JpaRepository<GeneroConteudo, Short> {

}
