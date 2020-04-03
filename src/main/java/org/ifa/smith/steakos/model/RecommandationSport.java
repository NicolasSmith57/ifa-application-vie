package org.ifa.smith.steakos.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "recommandesport")
@EntityListeners(AuditingEntityListener.class)
public class RecommandationSport extends Recommandation {

	/*@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;*/
	@ManyToMany
	@JoinTable(
			name = "recommandesport_muscle",
			joinColumns = @JoinColumn(name = "id_recommandesport"),
			inverseJoinColumns = @JoinColumn(name = "id_muscle"))
	Set<Muscle> listeMuscle;
	/*public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}*/

	public Set<Muscle> getListeSport() {
		return listeMuscle;
	}
	public void setListeSport(Set<Muscle> listeSport) {
		this.listeMuscle = listeSport;
	}
	
}
