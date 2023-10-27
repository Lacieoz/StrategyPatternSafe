package org.example;

import org.example.beans.Strategy;
import org.example.enumt.StrategyEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main implements CommandLineRunner {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(Main.class, args);
    }

    @Autowired
    private ApplicationContext context;

    @Override
    public void run(String... args) {
        StrategyEnum strategyEnum = StrategyEnum.STRATEGY_A;
        Strategy strategy = strategyEnum.getStrategy(context);
        strategy.execute();

        strategyEnum = StrategyEnum.STRATEGY_B;
        strategy = strategyEnum.getStrategy(context);
        strategy.execute();

        strategyEnum = StrategyEnum.STRATEGY_C;
        strategy = strategyEnum.getStrategy(context);
        strategy.execute();
    }

}