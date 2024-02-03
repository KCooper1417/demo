package com.moneypicks.demo;

import java.util.Scanner;

import org.hibernate.mapping.List;

public class MoneyPicksController {
    public static void main(String[] args){

        List<Integer> winningNumbers = new ArrayList<>();
        Random random = new Random();

        for(int i = 0; i < 3; i++){
            while (true) {
                int winningNumber = random.nextInt(999) + 1;
                if (!winningNumbers.contains(winningNumber)) {
                    winningNumbers.add(winningNumber);
                    break;
                }
            }
        }

        System.out.println(winningNumbers);
        System.out.println("Enter your 3 picks here (inclusive)");
        Scanner scanner = new Scanner(System.in);

        List<Integer>
        for (int i = 0; i < 3; i++){
            String numberString = scanner.nextLine();
            int number = Integer.parseInt(numberString);
            guessedNumbers.add(number);
        }
    }

}
