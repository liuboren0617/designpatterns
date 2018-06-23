package easyfactory.operation;

/**
 * @author liuboren
 * @Title:具体的乘法运算类
 * @Description:
 * @date 2018/5/9 12:43
 */
public class operationMul implements  Operation {
    @Override
    public Double getResult(Double num1, Double num2) {
        return num1*num2;
    }
}
