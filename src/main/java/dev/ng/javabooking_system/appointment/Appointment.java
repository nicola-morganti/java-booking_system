package dev.ng.javabooking_system.appointment;

import dev.ng.javabooking_system.service.Service;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Data
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "StartDate is required")
    @Column(nullable = false)
    private LocalDateTime startDate;

    @NotNull(message = "EndDate is required")
    @Column(nullable = false)
    private LocalDateTime endDate;

    @NotBlank(message = "FullName is required")
    @Column(nullable = false, length = 100)
    private String fullName;

    @NotBlank(message = "Email is required")
    @Email(message = "Email must be valid")
    @Column(nullable = false, length = 150)
    private String email;

    @NotBlank(message = "PhoneNumber is required")
    @Column(nullable = false, length = 30)
    private String phoneNumber;

    @NotNull(message = "Status is required")
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 30)
    private StatusEnum status = StatusEnum.PENDING;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "service_id", nullable = false)
    private Service service;
}