package br.com.fiap.engenhariagame.service;

import br.com.fiap.engenhariagame.domain.Mission;
import br.com.fiap.engenhariagame.domain.Player;

public class ScoreService {

    public void updateScore(Player player, int points) {
        // Lógica de pontuação centralizada
        player.addScore(points);
    }

    public int calculatePoints(Mission mission) {
        return mission.getDifficulty() * 10;
    }
}