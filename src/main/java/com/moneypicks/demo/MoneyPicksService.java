package com.moneypicks.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MoneyPicksService {

    public List<Integer> generateWinningNumbers() {
        List<Integer> winningNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            while (true) {
                int winningNumber = random.nextInt(1000); 
                if (!winningNumbers.contains(winningNumber)) {
                    winningNumbers.add(winningNumber);
                    break;
                }
            }
        }
        return winningNumbers;
    }

    public String determineOutcome(List<Integer> userPicks, List<Integer> winningNumbers) {
        int matchingNumbers = countMatchingNumbers(userPicks, winningNumbers);
        return determineOutcomeText(matchingNumbers);
    }

    public int countMatchingNumbers(List<Integer> userPicks, List<Integer> winningNumbers) {
        int count = 0;
        for (int userPick : userPicks) {
            if (winningNumbers.contains(userPick)) {
                count++;
            }
        }
        return count;
    }

    public String determineOutcomeText(int matchingNumbers) {
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
