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
        return "PlaceholderGameResult";
    }

    public String winningPicks() {
        return "PlaceholderGameResult";
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String winningPicks(String pick3, String pick4) {
        if (pick1.equals("Pick 3")) {
            return "Pick 3 wins!";
        } else if (pick2.equals("Pick 4")) {
            return "Pick 4 wins!";
        } else {
            return "No winning pick!";
        }
    }

    public String winningPicks(String pick1, String pick2, String winningPick1, String winningPick2) {
        if (pick1.equals(winningPick1) && pick2.equals(winningPick2)) {
            return "Jackpot! Both picks match the winning combination.";
        } else if (pick1.equals(winningPick1) || pick2.equals(winningPick2)) {
            return "Congratulations! One pick matches the winning combination.";
        } else {
            return "Sorry, none of your picks match the winning combination.";
        }
    }
    
}