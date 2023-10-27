package org.example.beans;

import org.springframework.stereotype.Service;

@Service
public class StrategyB implements Strategy {

    public void execute() {
        System.out.println("Executing strategy B");
    }
}
