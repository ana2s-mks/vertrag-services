package com.project.vertragservices.repository;

import com.project.vertragservices.model.Anschrift;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AnschriftRepository extends JpaRepository<Anschrift, Long> {

    @Query(value = "select a.* from Kunde k join Anschrift a on k.ANSCHRIFT_ID = a.id and k.id = :id", nativeQuery = true)
    Anschrift findAnschriftByKundeId(@Param("id") Long id);
}
