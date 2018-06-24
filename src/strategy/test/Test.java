package strategy.test;

        import strategy.context.Context;
        import strategy.strategy.impl.ConcreteStrategyA;
        import strategy.strategy.impl.ConcreteStrategyB;
        import strategy.strategy.impl.ConcreteStrategyC;

/**
 * @author liuboren
 * @Title:测试类
 * @Description:
 * @date 2018/5/30 14:57
 */
public class Test {
    public static void main(String [] args){
        Context context;

        context = new Context(new ConcreteStrategyA());
        context.contextInterface();

        context = new Context(new ConcreteStrategyB());
        context.contextInterface();

        context = new Context(new ConcreteStrategyC());
        context.contextInterface();

    }
}
