package br.com.fiap.engenhariagame.domain;

public class Player {
    private String name;
    private int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score; // Correção: usar o valor passado
    }

    // Método para adicionar pontos (agora implementado)
    public void addScore(int points) {
        this.score += points;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}