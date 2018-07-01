package decorator;

/**
 * @author liuboren
 * @Title:具体的装饰者类
 * @Description:
 * @date 2018/5/12 13:51
 */
public class ConcreteDecorator extends Decorator {

    @Override
    public void  operation(){
        //之所以能在之前的功能上添加新的功能,全靠这两句话
        super.operation();
        System.out.println("这是具体的装饰者类");
    }
}
