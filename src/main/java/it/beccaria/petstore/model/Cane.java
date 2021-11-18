package it.beccaria.petstore.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

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
@PrimaryKeyJoinColumn(name = "PET_ID")
@Entity
@Table(name = "CANE")
@EqualsAndHashCode(callSuper=false)
public class Cane extends Pet {

	private static final long serialVersionUID = -52705482688299796L;

	@Basic
	Boolean addestrato;

	@ManyToOne
	@JoinColumn(name = "TIPO_CANE_ID")
	private TipoCane tipoCane;

	@ManyToOne
	@JoinColumn(name = "TIPO_SESSO_ID")
	private TipoSesso tipoSesso;

}
