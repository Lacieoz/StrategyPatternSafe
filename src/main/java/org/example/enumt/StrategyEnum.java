package org.example.enumt;

import org.example.beans.Strategy;
import org.example.beans.StrategyA;
import org.example.beans.StrategyB;
import org.example.beans.StrategyC;
import org.springframework.context.ApplicationContext;

public enum StrategyEnum {
    
    STRATEGY_A {
        @Override
        public <T> T getStrategy(ApplicationContext context, Class<T> type) {
            return context.getBean(type);
        }
    },
    STRATEGY_B {
        @Override
        public <T> T getStrategy(ApplicationContext context, Class<T> type) {
            return context.getBean(type);
        }
    },
    STRATEGY_C {
        @Override
        public <T> T getStrategy(ApplicationContext context, Class<T> type) {
            return context.getBean(type);
        }
    };
    
    public abstract <T> T getStrategy(ApplicationContext context, Class<T> type);
}
