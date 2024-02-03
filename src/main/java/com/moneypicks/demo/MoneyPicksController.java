package com.moneypicks.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MoneyPicksController {
    public static void main(String[] args) {
        List<Integer> winningNumbers = generateWinningNumbers();
        System.out.println("Winning numbers: " + winningNumbers);

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
                int winningNumber = random.nextInt(1000); // Generates numbers between 0 and 999
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
        System.out.println("Enter your 3 picks here");
        for (int i = 0; i < 3; i++) {
            while (true) {
                String numberString = scanner.nextLine();
                try {
                    int number = Integer.parseInt(numberString);
                    if (number >= 0 && number <= 999) {
                        userPicks.add(number);
                        break;
                    } else {
                        System.out.println(number + " is not between 000 and 999. Try again.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                }
            }
        }
        return userPicks;
    }
}
