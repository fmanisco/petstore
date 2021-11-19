package it.beccaria.petstore.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import it.beccaria.entity.jpa.BeccariaIdEntity;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TITOLARE")
@EqualsAndHashCode
public class Titolare implements BeccariaIdEntity<Long> {

	private static final long serialVersionUID = -6517814714945392243L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Basic
	private String nome;

	@Basic
	private String cognome;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PETSTORE_ID")
	private Petstore petstore;


}
