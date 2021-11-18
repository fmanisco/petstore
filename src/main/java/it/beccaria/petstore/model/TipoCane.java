package it.beccaria.petstore.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import it.beccaria.entity.jpa.model.Tipologica;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString(callSuper = true, includeFieldNames = true)
@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "TIPO_CANE")
public class TipoCane extends Tipologica {

	private static final long serialVersionUID = 103406649221024615L;

}
