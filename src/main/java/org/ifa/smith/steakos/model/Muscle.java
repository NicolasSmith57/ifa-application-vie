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
@Table(name = "muscle")
@EntityListeners(AuditingEntityListener.class)
public class Muscle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String description;
	@ManyToMany(mappedBy = "listeMuscle")
	Set<RecommandationSport> listeRecommandationSports;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set<RecommandationSport> getListeRecommandationSports() {
		return listeRecommandationSports;
	}
	public void setListeRecommandationSports(Set<RecommandationSport> listeRecommandationSports) {
		this.listeRecommandationSports = listeRecommandationSports;
	}
	
}
