package tn.esprit.autolock.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolock.entities.Reservation;
import tn.esprit.autolock.Services.IReservationService;

import java.util.List;

@RestController
@RequestMapping("/Reservation")
@AllArgsConstructor
public class ReservationController {

    private IReservationService reservationService;

    @PostMapping("/AjouterReservation")
    public Reservation ajouterReservation(@RequestBody Reservation reservation) {
        return reservationService.ajouterReservation(reservation);
    }

    @PutMapping("/modifierReservation")
    public Reservation modifierReservation(@RequestBody Reservation reservation) {
        return reservationService.modifierReservation(reservation);
    }

    @DeleteMapping("/supprimerReservation/{id}")
    public void supprimerReservation(@PathVariable Long id) {
        reservationService.supprimerReservation(id);
    }

    @GetMapping("/getReservations")
    public List<Reservation> afficherReservations() {
        return reservationService.recupererReservations();
    }

}