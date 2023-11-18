package com.reservationAtelier.reservationAtelier.MVC.Models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Reservations")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ateliers_id")
    private Atelier atelier;

    @ManyToOne
    @JoinColumn(name = "artisans_id")
    private Artisan artisan;

    @ManyToOne
    @JoinColumn(name = "participants_id")
    private Participant participant;

    private LocalDateTime creneau;

    private String statut;

	public Reservation(Long id, Atelier atelier, Artisan artisan, Participant participant, LocalDateTime creneau,
			String statut) {
		super();
		this.id = id;
		this.atelier = atelier;
		this.artisan = artisan;
		this.participant = participant;
		this.creneau = creneau;
		this.statut = statut;
	}
	
	public Reservation() {
		
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Atelier getAtelier() {
		return atelier;
	}

	public void setAtelier(Atelier atelier) {
		this.atelier = atelier;
	}

	public Artisan getArtisan() {
		return artisan;
	}

	public void setArtisan(Artisan artisan) {
		this.artisan = artisan;
	}

	public Participant getParticipant() {
		return participant;
	}

	public void setParticipant(Participant participant) {
		this.participant = participant;
	}

	public LocalDateTime getCreneau() {
		return creneau;
	}

	public void setCreneau(LocalDateTime creneau) {
		this.creneau = creneau;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

    // Constructeurs, getters, setters
}
