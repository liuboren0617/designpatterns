package decorator;

/**
 * @author liuboren
 * @Title:
 * @Description:
 * @date 2018/5/12 13:52
 */
public class Test {
    public static void main(String [] args){
        Decorator decorator = new ConcreteDecorator();
        ConcreteComponent concreteComponent = new ConcreteComponent();
        decorator.setComponent(concreteComponent);
        decorator.operation();
    }
}
