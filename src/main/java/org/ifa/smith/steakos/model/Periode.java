package org.ifa.smith.steakos.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "periode")
@EntityListeners(AuditingEntityListener.class)
public class Periode {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int hDeb;
	private int hFin;
	private Date dateJour;
	private boolean notifLu;
	@ManyToOne
	@JoinColumn(name = "id_utilisateur")
	//@JsonManagedReference
	private Utilisateur utilisateur;
	@ManyToOne
	@JoinColumn(name = "id_activite")
	//@JsonManagedReference
	private Activite activite;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int gethDeb() {
		return hDeb;
	}
	public void sethDeb(int hDeb) {
		this.hDeb = hDeb;
	}
	public int gethFin() {
		return hFin;
	}
	public void sethFin(int hFin) {
		this.hFin = hFin;
	}
	public Date getDateJour() {
		return dateJour;
	}
	public void setDateJour(Date dateJour) {
		this.dateJour = dateJour;
	}
	public boolean isNotifLu() {
		return notifLu;
	}
	public void setNotifLu(boolean notifLu) {
		this.notifLu = notifLu;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public Activite getActivite() {
		return activite;
	}
	public void setActivite(Activite activite) {
		this.activite = activite;
	}

}
