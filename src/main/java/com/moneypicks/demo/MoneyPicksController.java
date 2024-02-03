package com.moneypicks.demo;

import java.util.Random;
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

        List<Integer> guessedNumbers = new ArryayList<>();
        for (int i = 0; i < 3; i++){
            while (true){
            String numberString = scanner.nextLine();
            int number = Integer.parseInt(numberString);
            if (number >= 00 && number <= 1000){
            guessedNumbers.add(number);
            break;
            }
            else{
                System.out.println(number + "is not between 000 and 999. Try again.");
            }
        }
        }
    }
}
