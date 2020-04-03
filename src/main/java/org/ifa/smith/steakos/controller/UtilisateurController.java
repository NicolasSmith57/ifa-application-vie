package org.ifa.smith.steakos.controller;

import java.util.List;

import org.ifa.smith.steakos.dao.IUtilisateurDao;
import org.ifa.smith.steakos.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UtilisateurController {
	
	IUtilisateurDao utilisateurDao;

	@Autowired
	public UtilisateurController(IUtilisateurDao utilisateurDao) {
		super();
		this.utilisateurDao = utilisateurDao;
	}
	
	@GetMapping("/utilisateurs")
	public List<Utilisateur> getCategorie() {
		return utilisateurDao.findAll();
	}
	
	@GetMapping("/utilisateur/{id}")
	public Utilisateur getUtilisateur(@PathVariable int id) {
		return utilisateurDao.findById(id).orElse(null);
	}
	
	@PutMapping("/utilisateurs")
	public Utilisateur saveCategorie(@RequestBody Utilisateur Utilisateur) {
		return utilisateurDao.save(Utilisateur);
	}

}
