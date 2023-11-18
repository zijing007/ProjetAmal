package com.reservationAtelier.reservationAtelier.MVC.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reservationAtelier.reservationAtelier.MVC.Models.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    // Ajoutez des méthodes personnalisées si nécessaire
}
