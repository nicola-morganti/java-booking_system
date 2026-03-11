package dev.ng.javabooking_system.team;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {
    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public List<Team> getAllStaff() {
        return teamRepository.findAll();
    }

    public Team createTeam(Team team) {
        return teamRepository.save(team);
    }
}
