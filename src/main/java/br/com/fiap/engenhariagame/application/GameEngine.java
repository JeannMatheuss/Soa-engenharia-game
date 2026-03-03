package br.com.fiap.engenhariagame.application;

import br.com.fiap.engenhariagame.domain.Mission;
import br.com.fiap.engenhariagame.domain.Player;
import br.com.fiap.engenhariagame.service.MissionValidatorService;
import br.com.fiap.engenhariagame.service.ScoreService;

public class GameEngine {
    private final MissionValidatorService validator;
    private final ScoreService scoreService;

    // Injeção de Dependência via Construtor
    public GameEngine(MissionValidatorService validator, ScoreService scoreService) {
        this.validator = validator;
        this.scoreService = scoreService;
    }

    public boolean executeMission(Player player, Mission mission) {
        boolean success = validator.validate(mission);

        if (success) {
            int points = scoreService.calculatePoints(mission);
            scoreService.updateScore(player, points);
        } else {
            scoreService.updateScore(player, -5);
        }

        return success;
    }
}