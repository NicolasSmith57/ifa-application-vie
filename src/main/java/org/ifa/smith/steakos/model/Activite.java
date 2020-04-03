package org.ifa.smith.steakos.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "activite")
@EntityListeners(AuditingEntityListener.class)
public class Activite {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	@OneToMany(mappedBy = "activite")
	@JsonBackReference
	private List<Periode> listePeriode = new ArrayList<>();
	@ManyToMany
	@JoinTable(
			name = "activite_recommandation",
			joinColumns = @JoinColumn(name = "id_activite"),
			inverseJoinColumns = @JoinColumn(name = "id_recommandation"))
	Set<Recommandation> listeRecommandation;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<Periode> getListePeriode() {
		return listePeriode;
	}
	public void setListePeriode(List<Periode> listePeriode) {
		this.listePeriode = listePeriode;
	}
	public Set<Recommandation> getListeRecommandation() {
		return listeRecommandation;
	}
	public void setListeRecommandation(Set<Recommandation> listeRecommandation) {
		this.listeRecommandation = listeRecommandation;
	}
	
	
}
