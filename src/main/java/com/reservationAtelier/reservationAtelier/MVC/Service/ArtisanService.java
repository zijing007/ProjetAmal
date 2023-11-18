package com.reservationAtelier.reservationAtelier.MVC.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservationAtelier.reservationAtelier.MVC.Models.Artisan;
import com.reservationAtelier.reservationAtelier.MVC.Repository.ArtisanRepository;

import java.util.List;

@Service
public class ArtisanService {

    @Autowired
    private ArtisanRepository artisanRepository;

    public List<Artisan> getAllArtisans() {
        return artisanRepository.findAll();
    }

    public Artisan getArtisanById(Long id) {
        return artisanRepository.findById(id).orElse(null);
    }
    
    // Autres méthodes liées à la logique métier des artisans
}

