package com.teste.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teste.teste.model.Pessoa;

/**
 * Pessoa Repositorio
 * 
 * @author gustavoclay
 *
 */
@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
