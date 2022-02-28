package com.project.vertragservices.repository;

import com.project.vertragservices.model.Kunde;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KundeRepository extends JpaRepository<Kunde, Long> {

}
