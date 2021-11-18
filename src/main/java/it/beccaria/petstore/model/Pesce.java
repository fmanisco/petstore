package it.beccaria.petstore.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
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
@Table(name = "PESCE")
@EqualsAndHashCode(callSuper=false)
public class Pesce extends Pet {

	private static final long serialVersionUID = 3080110588765039543L;

	@Basic
	Long lunghezza;

	@Basic
    Boolean tropicale;
}
