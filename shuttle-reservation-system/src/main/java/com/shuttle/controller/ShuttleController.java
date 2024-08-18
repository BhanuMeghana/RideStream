package com.shuttle.controller;

import com.shuttle.model.Reservation;
import com.shuttle.model.Shuttle;
import com.shuttle.model.User;
import com.shuttle.service.ReservationService;
import com.shuttle.service.ShuttleService;
import com.shuttle.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ShuttleController {
    @Autowired
    private ShuttleService shuttleService;

    @Autowired
    private UserService userService;

    @Autowired
    private ReservationService reservationService;

    @GetMapping("/shuttles")
    public List<Shuttle> getShuttles() {
        return shuttleService.getAllShuttles();
    }

    @PostMapping("/shuttle")
    public Shuttle saveShuttle(@RequestBody Shuttle shuttle) {
        return shuttleService.saveShuttle(shuttle);
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/user")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/reservations")
    public List<Reservation> getReservations() {
        return reservationService.getAllReservations();
    }

    @PostMapping("/reservation")
    public Reservation saveReservation(@RequestBody Reservation reservation) {
        return reservationService.saveReservation(reservation);
    }
}
