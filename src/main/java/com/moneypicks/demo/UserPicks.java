package com.moneypicks.demo;

import java.util.List;

public class UserPicks {
    private List<Integer> picks;

    public UserPicks(List<Integer> picks) {
        this.picks = picks;
    }

    public List<Integer> getPicks() {
        return picks;
    }

    public void setPicks(List<Integer> picks) {
        this.picks = picks;
    }

}



