package com.example.springassignment2;

import org.springframework.stereotype.Component;

@Component
public class Phone {

    private String mob;

    public void setNumber(String mob) {
        this.mob = mob;
    }

    public String getNumber() {
        return mob;
    }
}
