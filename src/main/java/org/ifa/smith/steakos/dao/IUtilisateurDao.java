package org.ifa.smith.steakos.dao;

import org.ifa.smith.steakos.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUtilisateurDao extends JpaRepository<Utilisateur, Integer> {

}
