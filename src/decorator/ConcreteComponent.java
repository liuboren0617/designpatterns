package decorator;

/**
 * @author liuboren
 * @Title:具体的组件类
 * @Description:
 * @date 2018/5/12 13:45
 */
public class ConcreteComponent implements  Component {

    @Override
    public void operation() {
        System.out.println("这是具体的ConcreteComponent的operation方法");
    }
}
