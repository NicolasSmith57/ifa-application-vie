package org.ifa.smith.steakos.controller;

import java.util.List;

import org.ifa.smith.steakos.dao.IActiviteDao;
import org.ifa.smith.steakos.model.Activite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ActiviteController {

	IActiviteDao activiteDao;

	@Autowired
	public ActiviteController(IActiviteDao activiteDao) {
		// TODO Auto-generated constructor stub
		this.activiteDao = activiteDao;
	}

	@GetMapping("/activites")
	public List<Activite> getCategorie() {
		return activiteDao.findAll();
	}

	@GetMapping("/activite/{id}")
	public Activite getCategorie(@PathVariable int id) {
		return activiteDao.findById(id).orElse(null);
	}

	@PutMapping("/activites")
	public Activite saveCategorie(@RequestBody Activite Activite) {
		return activiteDao.save(Activite);
	}

}
