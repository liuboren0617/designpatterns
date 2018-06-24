package strategy.context;

import strategy.strategy.Strategy;

/**
 * @author liuboren
 * @Title:调用算法类
 * @Description:
 * @date 2018/5/30 14:55
 */
public class Context {

    private Strategy strategy;

    //初始化的时候传入具体的策略对象
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    //根据具体的策略对象,调用其算法的方法
    public void contextInterface(){
        this.strategy.algorithmInterface();

    }
}
