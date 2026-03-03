package br.com.fiap.engenhariagame.application;

import br.com.fiap.engenhariagame.domain.Mission;
import br.com.fiap.engenhariagame.domain.Player;
import br.com.fiap.engenhariagame.service.BasicMissionValidatorService;

public class GameEngine {
    private BasicMissionValidatorService validator;

    public GameEngine(BasicMissionValidatorService validator) {
        this.validator = new BasicMissionValidatorService();
    }

    public boolean executeMission(Player player, Mission mission) {
        boolean sucess = validator.validate(mission);

        if(sucess) {
            player.addScore(mission.getDifficulty() * 10);
        } else {
            player.addScore(-5);
        }

        return sucess;
    }
}
