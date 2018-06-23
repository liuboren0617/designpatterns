package easyfactory.operation;

/**
 * @author liuboren
 * @Title:具体的减法运算类
 * @Description:
 * @date 2018/5/9 12:42
 */
public class operationSub implements  Operation {
    @Override
    public Double getResult(Double num1, Double num2) {
        return num1 - num2;
    }
}
