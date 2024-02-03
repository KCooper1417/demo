package com.moneypicks.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}

@Controller
class MoneyPicksController {

    private List<Integer> winningNumbers;

    @GetMapping("/pick")
    public String showPickPage() {
        return "index";
    }

    @PostMapping("/userPicks")
    public String submitUserPicks(@RequestParam("pick1") int pick1,
                                  @RequestParam("pick2") int pick2,
                                  @RequestParam("pick3") int pick3,
                                  Model model) {
        generateWinningNumbers();
        model.addAttribute("winningNumbers", winningNumbers);
        return "result";
    }

    private void generateWinningNumbers() {
        winningNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            winningNumbers.add(random.nextInt(1000));
        }
    }
}
