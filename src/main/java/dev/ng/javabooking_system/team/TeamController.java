package dev.ng.javabooking_system.team;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeamController {

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping("/team")
    public List<Team> getAllStaff() {
        return teamService.getAllStaff();
    }

    @PostMapping("/team")
    public Team createTeam(@Valid @RequestBody Team team) {
        return teamService.createTeam(team);
    }
}