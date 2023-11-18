package com.reservationAtelier.reservationAtelier.MVC.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.reservationAtelier.reservationAtelier.MVC.Service.ArtisanService;

@Controller
public class ArtisanController {

    @Autowired
    private ArtisanService artisanService;

    @GetMapping("/artisans")
    public String afficherListeArtisans(Model model) {
        model.addAttribute("artisans", artisanService.getAllArtisans());
        return "artisans/listeArtisans";
    }

    

    // Ajoutez d'autres méthodes pour gérer les actions spécifiques aux artisans si nécessaire
}
