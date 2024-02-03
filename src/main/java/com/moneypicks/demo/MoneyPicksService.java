package com.moneypicks.demo;


public class MoneyPicksService {

    public static void main(String[] args) {
        MoneyPickGames moneyPickGame = new MoneyPickGames("123", "Pick 3");
        String result = moneyPickGame.winningPicks("Pick 3", "Pick 4");
        System.out.println("Result: " + result);

        System.out.println("Number: " + moneyPickGame.getNumber());
        System.out.println("Game: " + moneyPickGame.getGame());
    }

    public void winningPicks("Pick 3", "Pick 4") {
        return "PlaceholderGameResult";
    }

    public String winningPicks(String pick1, String pick2) {


        return "PlaceholderGameResult";
    }