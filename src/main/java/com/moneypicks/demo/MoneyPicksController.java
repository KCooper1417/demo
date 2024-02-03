package com.moneypicks.demo;

public class MoneyPicksController {
    public static void main(String[] args){

        List<INTEGER> winningNumbers = new ArrayList<>();
        Random random = new Random();

        for(int i = 0; i < 3; i++){
            while (true) {
                int winningNumber = random.nextInt(999) + 1;
                if (!winningNumbers.contains(winningNumber)) {
                    winningNumbers.add(winningNumber);
                }
            }
        }
    }

}
