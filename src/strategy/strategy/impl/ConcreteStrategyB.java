package strategy.strategy.impl;

import strategy.strategy.Strategy;

/**
 * @author liuboren
 * @Title:具体算法类B
 * @Description:
 * @date 2018/5/30 14:54
 */
public class ConcreteStrategyB extends Strategy {

    @Override
    public void algorithmInterface() {
        System.out.println("算法B实现");
    }
}
