package org.ifa.smith.steakos.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "recommandenutrition")
@EntityListeners(AuditingEntityListener.class)
public class RecommandationNutrition extends Recommandation {
	
	/*@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;*/
	@ManyToMany
	@JoinTable(
			name = "recommandenutrition_aliment",
			joinColumns = @JoinColumn(name = "id_recommandenutrition"),
			inverseJoinColumns = @JoinColumn(name = "id_aliment"))
	Set<Aliment> listeAliment;
	/*public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}*/
	public Set<Aliment> getListeAliment() {
		return listeAliment;
	}
	public void setListeAliment(Set<Aliment> listeAliment) {
		this.listeAliment = listeAliment;
	}

}
