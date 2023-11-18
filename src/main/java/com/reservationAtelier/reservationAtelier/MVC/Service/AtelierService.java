package com.reservationAtelier.reservationAtelier.MVC.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservationAtelier.reservationAtelier.MVC.Models.Atelier;
import com.reservationAtelier.reservationAtelier.MVC.Repository.AtelierRepository;

import java.util.List;

@Service
public class AtelierService {

    @Autowired
    private AtelierRepository atelierRepository;

    public List<Atelier> getAllAteliers() {
        return atelierRepository.findAll();
    }

    public Atelier getAtelierById(Long id) {
        return atelierRepository.findById(id).orElse(null);
    }
    
    // Autres méthodes liées à la logique métier des ateliers
}
