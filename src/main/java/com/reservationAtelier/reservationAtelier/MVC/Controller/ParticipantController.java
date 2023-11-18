package com.reservationAtelier.reservationAtelier.MVC.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.reservationAtelier.reservationAtelier.MVC.Service.ParticipantService;

@Controller
public class ParticipantController {

    @Autowired
    private ParticipantService participantService;

    @GetMapping("/participants")
    public String afficherListeParticipants(Model model) {
        model.addAttribute("participants", participantService.getAllParticipants());
        return "participants/listeParticipants";
    }

    

    // Ajoutez d'autres méthodes pour gérer les actions spécifiques aux participants si nécessaire
}
