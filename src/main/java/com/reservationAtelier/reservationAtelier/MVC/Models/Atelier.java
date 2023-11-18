package com.reservationAtelier.reservationAtelier.MVC.Models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Ateliers")
public class Atelier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nom;
    private String description;

    @OneToMany(mappedBy = "atelier")
    private List<Reservation> reservations;

	public Atelier(int id, String nom, String description, List<Reservation> reservations) {
		super();
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.reservations = reservations;
	}
	public Atelier() {
        // Laissez ce constructeur vide ou initialisez des valeurs par défaut si nécessaire
    }

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

    // Constructeurs, getters, setters
}
