package easyfactory.test;

import cn.bj.patterns.factory.easyFactory.factory.OperationFactory;
import cn.bj.patterns.factory.easyFactory.operation.Operation;

/**
 * @author liuboren
 * @Title:测试类
 * @Description:
 * @date 2018/5/10 19:11
 */
public class Test {
    public static void main(String [] args){
        Operation operation = OperationFactory.getOperation("+");
        Double num = operation.getResult(1.0,2.0);
        System.out.println("得到的num是:"+num);

        Operation operationSub = OperationFactory.getOperation("-");
        Double numSub = operationSub.getResult(1.0,2.0);
        System.out.println("得到的num是:"+numSub);

        Operation operationMul = OperationFactory.getOperation("*");
        Double numMul = operationMul.getResult(1.0,2.0);
        System.out.println("得到的num是:"+numMul);

        Operation operationDeduct = OperationFactory.getOperation("/");
        Double numDeduct = operationDeduct.getResult(1.0,2.0);
        System.out.println("得到的num是:"+numDeduct);
    }
}
