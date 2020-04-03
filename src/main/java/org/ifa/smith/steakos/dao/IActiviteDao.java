package org.ifa.smith.steakos.dao;

import org.ifa.smith.steakos.model.Activite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IActiviteDao extends JpaRepository<Activite, Integer> {

}
