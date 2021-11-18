package it.beccaria.petstore.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name = "PETSTORE")
@EqualsAndHashCode
public class Petstore implements BeccariaIdEntity<Long> {
	private static final long serialVersionUID = 7333808906714073151L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne(mappedBy = "petstore", cascade = CascadeType.ALL, orphanRemoval = true)
	private Titolare titolare;

	@OneToMany(mappedBy = "petstore", cascade = CascadeType.ALL, orphanRemoval = true)
	private Collection<Cane> cani;

	@OneToMany(mappedBy = "petstore", cascade = CascadeType.ALL, orphanRemoval = true)
	private Collection<Gatto> gatti;

	@OneToMany(mappedBy = "petstore", cascade = CascadeType.ALL, orphanRemoval = true)
	private Collection<Pesce> pesci;

}
