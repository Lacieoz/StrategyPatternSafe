package org.example.enumt;

import org.example.beans.Strategy;
import org.example.beans.StrategyA;
import org.example.beans.StrategyB;
import org.example.beans.StrategyC;
import org.springframework.context.ApplicationContext;

public enum StrategyEnum {

    STRATEGY_A () {
        @Override
        public Strategy getStrategy (ApplicationContext context) {
            return context.getBean(StrategyA.class);
        }
    },
    STRATEGY_B () {
        @Override
        public Strategy getStrategy (ApplicationContext context) {
            return context.getBean(StrategyB.class);
        }
    },
    STRATEGY_C () {
        @Override
        public Strategy getStrategy (ApplicationContext context) {
            return context.getBean(StrategyC.class);
        }
    };

    public abstract Strategy getStrategy(ApplicationContext context);

}
