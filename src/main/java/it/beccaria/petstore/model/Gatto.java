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
@Table(name = "GATTO")
@EqualsAndHashCode(callSuper=false)
public class Gatto extends Pet {

	private static final long serialVersionUID = 1680837068816278779L;

	@Basic
    Boolean graffiante;

	@ManyToOne
	@JoinColumn(name = "TIPO_GATTO_ID")
	private TipoGatto tipoGatto;

	@ManyToOne
	@JoinColumn(name = "TIPO_SESSO_ID")
	private TipoSesso tipoSesso;


}
