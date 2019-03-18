package com.teste.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teste.teste.model.Endereco;

/**
 * @author gustavoclay
 *
 */
@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}
