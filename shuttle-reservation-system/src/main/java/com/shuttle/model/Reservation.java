package com.shuttle.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "shuttle_id")
    private Shuttle shuttle;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private LocalDateTime reservationTime;

    // Getters and Setters
}
