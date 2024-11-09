package com.example.foyer_5se3.DAO.Repositories;

import com.example.foyer_5se3.DAO.Entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, String> {
  int countByAnneeUniversitaireBetween(LocalDate dateInf, LocalDate dateSup);
  Reservation findByEtudiantsCinAndEstValide(long cin,boolean isValid);

}
