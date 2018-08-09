package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
	
	@OneToMany(mappedBy="aeroportArrivee")
	private List<Vol> VolsArrivee;
	
	@OneToMany(mappedBy="aeroportDepart")
	private List<Vol> VolsDepart;
	
	@OneToMany(mappedBy = "key.aeroports", fetch = FetchType.LAZY)
    private List<VilleAeroport> villes;
	
	
	
	
}
