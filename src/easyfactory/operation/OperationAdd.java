package easyfactory.operation;

/**
 * @author liuboren
 * @Title:
 * @Description:
 * @date 2018/5/9 12:39
 */
public class OperationAdd implements Operation {

    @Override
    public Double getResult(Double num1, Double num2) {
        return  num1+num2;
    }
}
