package com.moneypicks.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MoneyPicksController {
    public static void main(String[] args) {
        List<Integer> userPicks = getUserPicks();
        System.out.println("Guessed numbers: " + userPicks);

        MoneyPicksService service = new MoneyPicksService();
        String outcome = service.determineOutcome(userPicks, winningNumbers);
        System.out.println(outcome);
    }

    private static List<Integer> generateWinningNumbers() {
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

    private static List<Integer> getUserPicks() {
        List<Integer> userPicks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your pick 3 numbers here seperated with a space. [1 2 3]");
        
        for(int i = 1; i <= 3; i++){
            int pick = scanner.nextInt();
            userPicks.add(pick);
        }

        List<Integer> winningNumbers = generateWinningNumbers();
        System.out.println("Winning numbers: " + winningNumbers);

        return userPicks;

        
    }
}
