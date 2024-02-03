package com.moneypicks.demo;

public class MoneyPicksGames {
    
    private String number;
    private String game;

    public MoneyPicksGames(String number, String game) {
        this.number = number;
        this.game = game;
    }

    public String getNumber() {
        return number;
    }

    public String getGame() {
        return game;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String determineOutcome(String userPick1, String userPick2, String winningPick1, String winningPick2) {
        if (userPick1.equals(winningPick1) && userPick2.equals(winningPick2)) {
            return "Jackpot! Both picks match the winning combination.";
        } else if (userPick1.equals(winningPick1) || userPick2.equals(winningPick2)) {
            return "Congratulations! One pick matches the winning combination.";
        } else {
            return "Sorry, none of your picks match the winning combination.";
        }
    }
}
