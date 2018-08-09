package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name = "aeroport")
@SequenceGenerator(name = "seqAeroport", sequenceName = "seq_aeroport", initialValue = 1, allocationSize = 1)
public class Aeroport {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqAeroport")
	@Column(name="id_aeroport")
	private Integer id_aeroport;
	
	@Column(name="nom")
	private String nom;
	
	private setvolDepart;
	private Vol volArrivee;
	
	
	@OneToMany(mappedBy="")
	private Ville ville;
	
	
	
}
