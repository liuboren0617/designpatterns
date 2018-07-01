package decorator;

/**
 * @author liuboren
 * @Title:装饰者类
 * @Description:
 * @date 2018/5/12 13:48
 */
public abstract class Decorator implements Component {
    protected  Component component;

    public void setComponent(Component component){
        this.component = component;
    }

    @Override
    public void  operation(){
        this.component.operation();
    }

}
