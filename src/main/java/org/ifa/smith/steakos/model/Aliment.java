package org.ifa.smith.steakos.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "aliment")
@EntityListeners(AuditingEntityListener.class)
public class Aliment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	@ManyToMany(mappedBy = "listeAliment")
	Set<RecommandationNutrition> listeRecommandationNutrition;
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
	public Set<RecommandationNutrition> getListeRecommandationNutrition() {
		return listeRecommandationNutrition;
	}
	public void setListeRecommandationNutrition(Set<RecommandationNutrition> listeRecommandationNutrition) {
		this.listeRecommandationNutrition = listeRecommandationNutrition;
	}

}
