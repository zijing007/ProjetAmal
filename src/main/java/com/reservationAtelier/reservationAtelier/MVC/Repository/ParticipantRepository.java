package com.reservationAtelier.reservationAtelier.MVC.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reservationAtelier.reservationAtelier.MVC.Models.Participant;

@Repository
public interface ParticipantRepository extends JpaRepository<Participant, Long> {
    // Ajoutez des méthodes personnalisées si nécessaire
}
