package dev.ng.javabooking_system.appointment;

import dev.ng.javabooking_system.service.Service;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private String fullName;

    private String email;

    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private StatusEnum status;

    @OneToOne
    @JoinColumn(name = "service_id")
    private Service service;
}
