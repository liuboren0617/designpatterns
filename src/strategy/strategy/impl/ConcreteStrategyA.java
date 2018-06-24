package strategy.strategy.impl;

import strategy.strategy.Strategy;

/**
 * @author liuboren
 * @Title:具体算法类A
 * @Description:
 * @date 2018/5/30 14:53
 */
public class ConcreteStrategyA extends Strategy {

    @Override
    public void algorithmInterface() {
        System.out.println("算法A实现");
    }
}
