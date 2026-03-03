package br.com.fiap.engenhariagame.domain;

public class Player {
    private String name;
    private int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = 0;
    }

    public void addScore(int points) {
        //Implementar
    }


    public int getScore() {
        return score;
    }
}
