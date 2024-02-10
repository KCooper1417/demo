package com.moneypicks.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MoneyPickGames {
    
    private String playerPick;
    private String gameType;

    public MoneyPickGames(String playerPick, String gameType) {
        this.playerPick = playerPick;
        this.gameType = gameType;
    }

    public String getPlayerPick() {
        return playerPick;
    }

    public String getGameType() {
        return gameType;
    }

    public String determineOutcome(String winningPick) {
        if (playerPick.equals(winningPick)) {
            return "Congratulations! You've won!";
        } else {
            return "Sorry, you didn't win. Better luck next time!";
        }
    }

    public String determineOutcome(MoneyPickGames winningGame) {
        if (playerPick.equals(winningGame.getPlayerPick()) && gameType.equals(winningGame.getGameType())) {
            return "Jackpot! Your pick and game type match the winning combination.";
        } else {
            return "Sorry, your pick or game type didn't match the winning combination.";
        }
    }
}


