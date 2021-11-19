package it.beccaria.petstore.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Table(name = "PET")
@EqualsAndHashCode
public class Pet implements BeccariaIdEntity<Long> {

	private static final long serialVersionUID = -4389114458032718667L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Basic
	String nome;

	@Basic
	Long eta;

	@Basic
	Long prezzo;

	@ManyToOne
	@JoinColumn(name = "PETSTORE_ID")
	private Petstore petstore;

	@ManyToOne
	@JoinColumn(name = "TIPO_PET_ID")
	private TipoPet tipoPet;

}
