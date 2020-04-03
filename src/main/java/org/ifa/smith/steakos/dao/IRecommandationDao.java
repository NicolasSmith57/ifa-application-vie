package org.ifa.smith.steakos.dao;

import org.ifa.smith.steakos.model.Recommandation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRecommandationDao extends JpaRepository<Recommandation, Integer> {
	
}
