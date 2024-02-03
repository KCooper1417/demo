package com.moneypicks.demo;

import java.util.List;

public class MoneyPicksService {

    // Method to compare user picks with winning numbers and determine the outcome
    public String determineOutcome(List<Integer> userPicks, List<Integer> winningNumbers) {
        // Count the number of matching numbers between userPicks and winningNumbers
        int matchingNumbers = countMatchingNumbers(userPicks, winningNumbers);

        // Determine the outcome based on the number of matching numbers
        return determineOutcomeText(matchingNumbers);
    }

    // Method to count the number of matching numbers between user picks and winning numbers
    private int countMatchingNumbers(List<Integer> userPicks, List<Integer> winningNumbers) {
        int count = 0;
        for (int userPick : userPicks) {
            if (winningNumbers.contains(userPick)) {
                count++;
            }
        }
        return count;
    }

    // Method to determine the outcome text based on the number of matching numbers
    private String determineOutcomeText(int matchingNumbers) {
        // Determine the outcome text based on the number of matching numbers
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
