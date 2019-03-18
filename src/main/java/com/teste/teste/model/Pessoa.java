package com.teste.teste.model;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.teste.teste.model.enums.EstadoCivilEnum;
import com.teste.teste.model.enums.SexoEnum;

import lombok.Data;

/**
 * Classe Pessoa
 * 
 * @author gustavoclay
 * 
 */

@Data
@Entity(name = "tb_pessoa")
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pessoa")
	private Long codigo;

	private String nome;

	private String cpf;

	private String telefone;

	private String celular;

	@OneToMany(mappedBy = "pessoa")
	private Set<Endereco> enderecos;

	@Enumerated
	private SexoEnum sexo;

	@Enumerated
	private EstadoCivilEnum estadoCivil;

	@Column(name = "dt_nascimento")
	private LocalDate dataNascimento;

}
