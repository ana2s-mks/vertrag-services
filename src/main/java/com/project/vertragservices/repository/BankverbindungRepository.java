package com.project.vertragservices.repository;

import com.project.vertragservices.model.Bankverbindung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BankverbindungRepository extends JpaRepository<Bankverbindung, Long> {

    @Query(value = "select b.* from Kunde k join Bankverbindung b on k.BANKVERBINDUNG_ID = b.id and k.id = :id", nativeQuery = true)
    Bankverbindung findBankverbindungByKundeId(@Param("id") Long id);
}
