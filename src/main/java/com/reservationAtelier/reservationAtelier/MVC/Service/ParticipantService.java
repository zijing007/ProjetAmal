package com.reservationAtelier.reservationAtelier.MVC.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservationAtelier.reservationAtelier.MVC.Models.Participant;
import com.reservationAtelier.reservationAtelier.MVC.Repository.ParticipantRepository;

import java.util.List;

@Service
public class ParticipantService {

    @Autowired
    private ParticipantRepository participantRepository;

    public List<Participant> getAllParticipants() {
        return participantRepository.findAll();
    }

    public Participant getParticipantById(Long id) {
        return participantRepository.findById(id).orElse(null);
    }
    
    // Autres méthodes liées à la logique métier des participants
}
