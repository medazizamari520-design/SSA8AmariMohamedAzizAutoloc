package tn.esprit.autolock.Services;

import tn.esprit.autolock.entities.Reservation;

import java.util.List;

public interface IReservationService {

    Reservation ajouterReservation(Reservation reservation);

    Reservation modifierReservation(Reservation reservation);

    void supprimerReservation(Long id);

    List<Reservation> recupererReservations();
}