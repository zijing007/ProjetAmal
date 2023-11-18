package com.reservationAtelier.reservationAtelier.MVC.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.reservationAtelier.reservationAtelier.MVC.Models.Atelier;
import com.reservationAtelier.reservationAtelier.MVC.Service.AtelierService;

@Controller
public class AtelierController {

    @Autowired
    private AtelierService atelierService;

    @GetMapping("/ateliers")
    public String afficherAteliers(Model model) {
        List<Atelier> ateliers = atelierService.getAllAteliers();
        model.addAttribute("ateliers", ateliers);
        return "ateliers/listeAteliers";
    }
    
    
}