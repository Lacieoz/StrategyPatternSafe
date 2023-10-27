package org.example.beans;

import org.springframework.stereotype.Service;

@Service
public class StrategyA implements Strategy {

    public void execute() {
        System.out.println("Executing strategy A");
    }
}
