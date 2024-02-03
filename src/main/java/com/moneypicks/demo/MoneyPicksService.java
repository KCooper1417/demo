package com.moneypicks.demo;

import java.util.List;

public class MoneyPicksService {

    public String determineOutcome(List<Integer> userPicks, List<Integer> winningNumbers) {
        int matchingNumbers = countMatchingNumbers(userPicks, winningNumbers);

        return determineOutcomeText(matchingNumbers);
    }

    private int countMatchingNumbers(List<Integer> userPicks, List<Integer> winningNumbers) {
        int count = 0;
        for (int userPick : userPicks) {
            if (winningNumbers.contains(userPick)) {
                count++;
            }
        }
        return count;
    }

    private String determineOutcomeText(int matchingNumbers) {
        switch (matchingNumbers) {
            case 3:
                return "Congratulations! You've won the jackpot!";
            case 2:
                return "Congratulations! You've matched 2 numbers!";
            case 1:
                return "Congratulations! You've matched 1 number!";
            default:
                return "Sorry, you didn't match any numbers. Better luck next time!";
        }
    }
}
