package easyfactory.operation;

/**
 * @author liuboren
 * @Title:具体的除法运算类
 * @Description:
 * @date 2018/5/9 12:44
 */
public class operationDeduct implements  Operation {
    @Override
    public Double getResult(Double num1, Double num2) {
        if (num2!=0) {
            return num1 / num2;
        }else{
            try {
                throw  new Exception("除数不能为零");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
