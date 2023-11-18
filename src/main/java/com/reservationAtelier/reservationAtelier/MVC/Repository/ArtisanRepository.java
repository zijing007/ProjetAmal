package com.reservationAtelier.reservationAtelier.MVC.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reservationAtelier.reservationAtelier.MVC.Models.Artisan;

@Repository
public interface ArtisanRepository extends JpaRepository<Artisan, Long> {
    // Ajoutez des méthodes personnalisées si nécessaire
}

