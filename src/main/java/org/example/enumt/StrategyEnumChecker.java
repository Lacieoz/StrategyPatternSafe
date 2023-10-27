package org.example.enumt;

import jakarta.annotation.PostConstruct;
import org.example.beans.Strategy;
import org.example.beans.StrategyA;
import org.example.beans.StrategyB;
import org.example.beans.StrategyC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class StrategyEnumChecker {

    @Autowired
    private ApplicationContext context;

    @PostConstruct
    public void initChecker() {
        for (StrategyEnum strategy : StrategyEnum.values()) {
            try {
                strategy.getStrategy(context);
            } catch (Exception ex) {
                System.out.println("ERRORE STARTUP '" + ex.getMessage() + "' - '"
                        + Arrays.toString(ex.getStackTrace()) + "'");
                SpringApplication.exit(context, () -> 0);
            }
        }
    }

    private StrategyEnumChecker () {}

}
