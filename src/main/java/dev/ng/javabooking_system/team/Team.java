package dev.ng.javabooking_system.team;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class Team {

    @Id
    private Long id;

    private String name;

    private String description;
}
