package com.moneypicks.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MoneyPicksController {

    // private final MoneyPicksService moneyPicksService;

    public MoneyPicksController(MoneyPicksService moneyPicksService) {
        this.moneyPicksService = moneyPicksService;
    }

    @Autowired
    private MoneyPicksService moneyPicksService;

    @GetMapping("/generateWinningNumbers")
    @ResponseBody
    public List<Integer>generateWinningNumbers(){
        return moneyPicksService.generateWinningNumbers();
    }

    @GetMapping("/pick")
    public String showPickPage() {
        return "index";
    }

    @PostMapping("/userPicks")
    public String submitUserPicks(@RequestParam("pick1") int pick1,
                                  @RequestParam("pick2") int pick2,
                                  @RequestParam("pick3") int pick3,
                                  Model model) {
        List<Integer> userPicks = List.of(pick1, pick2, pick3);
        List<Integer> winningNumbers = moneyPicksService.generateWinningNumbers();
        model.addAttribute("winningNumbers", winningNumbers);
        String outcome = moneyPicksService.determineOutcome(userPicks, winningNumbers);
        model.addAttribute("outcome", outcome);
        return "result";
    }

}