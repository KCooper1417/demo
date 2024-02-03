package com.moneypicks.demo;

public class MoneyPicksService {

    public static void main(String[] args) {
        MoneyPicksGames moneyPicksGame = new MoneyPicksGames("123", "Pick 3");
        String result = moneyPicksGame.winningPicks("Pick 3", "Pick 4");
        System.out.println("Result: " + result);

        System.out.println("Number: " + moneyPicksGame.getNumber());
        System.out.println("Game: " + moneyPicksGame.getGame());
    }

    public String winningPicks() {
        return "PlaceholderGameResult";
    }

    public String winningPicks(String pick1, String pick2) {
        // Implement the logic to determine the winning picks
        // For now, let's return a placeholder result
        return "PlaceholderGameResult";
    }
}
