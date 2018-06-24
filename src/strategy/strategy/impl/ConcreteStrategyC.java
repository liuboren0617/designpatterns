package strategy.strategy.impl;

import strategy.strategy.Strategy;

/**
 * @author liuboren
 * @Title:具体算法类C
 * @Description:
 * @date 2018/5/30 14:55
 */
public class ConcreteStrategyC extends Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("算法C实现");
    }
}
