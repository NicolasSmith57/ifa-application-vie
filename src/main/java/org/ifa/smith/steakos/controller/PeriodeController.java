package org.ifa.smith.steakos.controller;

import java.util.List;

import org.ifa.smith.steakos.dao.IPeriodeDao;
import org.ifa.smith.steakos.model.Periode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class PeriodeController {
	
	IPeriodeDao periodeDao;

	@Autowired
	public PeriodeController(IPeriodeDao periodeDao) {
		// TODO Auto-generated constructor stub
		this.periodeDao = periodeDao;
	}

	@GetMapping("/periodes")
	public List<Periode> getCategorie() {
		return periodeDao.findAll();
	}

	@GetMapping("/periode/{id}")
	public Periode getCategorie(@PathVariable int id) {
		return periodeDao.findById(id).orElse(null);
	}

	@PutMapping("/periodes")
	public Periode saveCategorie(@RequestBody Periode Periode) {
		return periodeDao.save(Periode);
	}

}
