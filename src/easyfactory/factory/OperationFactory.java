package easyfactory.factory;


import easyfactory.operation.*;

/**
 * @author liuboren
 * @Title:
 * @Description:
 * @date 2018/5/10 19:14
 */
public class OperationFactory {

        /**
          *获得操作类方法
          */
          public static Operation getOperation(String  type){
              Operation operation = null ;
              switch (type ){
                  case "+":
                  operation = new OperationAdd();
                    break;

                  case "-":
                      operation = new operationSub();
                      break;
                  case "*":
                      operation = new operationMul();
                      break;
                  case "/":
                      operation = new operationDeduct();
                      break;
              }
              return  operation;
          }


}
