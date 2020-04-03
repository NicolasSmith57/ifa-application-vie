package org.ifa.smith.steakos.controller;

import java.util.List;

import org.ifa.smith.steakos.dao.IRecommandationDao;
import org.ifa.smith.steakos.model.Recommandation;
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
public class RecommandationController {

	IRecommandationDao recommandationDao;

	@Autowired
	public RecommandationController(IRecommandationDao recommandationDao) {
		// TODO Auto-generated constructor stub
		this.recommandationDao = recommandationDao;
	}

	@GetMapping("/recommandations")
	public List<Recommandation> getNotification() {
		return recommandationDao.findAll();
	}
	//
	/*@GetMapping({"/listeRecommandation"})
	public List<Recommandation> listRecommandation() {
		return recommandationDao.findAll();
	}*/
	//
	@GetMapping("/recommandation/{id}")
	public Recommandation getNotification(@PathVariable int id) {
		return recommandationDao.findById(id).orElse(null);
	}

	@PutMapping("/recommandations")
	public Recommandation saveNotification(@RequestBody Recommandation Recommandation) {
		return recommandationDao.save(Recommandation);
	}

}
