package com.reservationAtelier.reservationAtelier.MVC.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reservationAtelier.reservationAtelier.MVC.Models.Atelier;

@Repository
public interface AtelierRepository extends JpaRepository<Atelier, Long> {
    // Ajoutez des méthodes personnalisées si nécessaire
}
