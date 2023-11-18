package com.reservationAtelier.reservationAtelier.MVC.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservationAtelier.reservationAtelier.MVC.Models.Atelier;
import com.reservationAtelier.reservationAtelier.MVC.Models.Participant;
import com.reservationAtelier.reservationAtelier.MVC.Models.Reservation;
import com.reservationAtelier.reservationAtelier.MVC.Repository.ArtisanRepository;
import com.reservationAtelier.reservationAtelier.MVC.Repository.AtelierRepository;
import com.reservationAtelier.reservationAtelier.MVC.Repository.ParticipantRepository;
import com.reservationAtelier.reservationAtelier.MVC.Repository.ReservationRepository;

import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private AtelierRepository atelierRepository;

    @Autowired
    private ArtisanRepository artisanRepository;

    @Autowired
    private ParticipantRepository participantRepository;

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    public Reservation getReservationById(Long id) {
        return reservationRepository.findById(id).orElse(null);
    }

    public void reserverCreneau(Long atelierId, Long participantId) {
        Atelier atelier = atelierRepository.findById(atelierId).orElse(null);
        Participant participant = participantRepository.findById(participantId).orElse(null);

        // Logique pour réserver un créneau
        Reservation reservation = new Reservation(participantId, atelier, null, participant, null, null);
        reservation.setAtelier(atelier);
        reservation.setParticipant(participant);
        // Définir d'autres propriétés de la réservation...
        reservationRepository.save(reservation);
    }

    public void annulerReservation(Long id) {
        // Logique pour annuler une réservation
        reservationRepository.deleteById(id);
    }

	public Reservation findById(Long reservationId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(Reservation updatedReservation) {
		// TODO Auto-generated method stub
		
	}

	public void deleteReservation(Long reservationId) {
		// TODO Auto-generated method stub
		reservationRepository.deleteById(reservationId);
	}

    // Ajoutez d'autres méthodes métier liées aux réservations si nécessaire
}


