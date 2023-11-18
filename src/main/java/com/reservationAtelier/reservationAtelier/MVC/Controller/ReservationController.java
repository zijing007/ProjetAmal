package com.reservationAtelier.reservationAtelier.MVC.Controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.reservationAtelier.reservationAtelier.MVC.Models.Reservation;
import com.reservationAtelier.reservationAtelier.MVC.Service.ReservationService;

@Controller
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping("/reservations")
    public String afficherListeReservations(Model model) {
        model.addAttribute("reservations", reservationService.getAllReservations());
        return "reservations/listeReservations";
    }

    @GetMapping("/reservations/{id}")
    public String afficherDetailsReservation(@PathVariable Long id, Model model) {
        model.addAttribute("reservation", reservationService.getReservationById(id));
        return "reservations/detailsReservation";
    }

    @PostMapping("/ateliers/{id}/reserver")
    public String reserverCreneau(@PathVariable Long id, @RequestParam("participantId") Long participantId) {
        reservationService.reserverCreneau(id, participantId);
        return "redirect:/ateliers/{id}";
    }

    @PostMapping("/reservations/{id}/annuler")
    public String annulerReservation(@PathVariable Long id) {
        reservationService.annulerReservation(id);
        return "redirect:/reservations";
    }
    @GetMapping("/")
    public String showMainPage() {
        return "index";
    }

    

    @PostMapping("/updateReservation")
    public String updateMainPage(Model model) {
    	 model.addAttribute("reservations", reservationService.getAllReservations());
        return "reservations/listeReservations";
    }
    @PostMapping("/deleteReservation/{reservationId}")
    public String deleteReservation(@PathVariable Long reservationId) {
    
        reservationService.deleteReservation(reservationId);
        return "redirect:/reservations"; 
    }
    // Ajoutez d'autres méthodes pour gérer les actions spécifiques aux réservations si nécessaire
}

