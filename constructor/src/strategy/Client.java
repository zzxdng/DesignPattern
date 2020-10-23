package strategy;

/**
 * Created by Administrator on 2020/10/24.
 */
public class Client {

    public static void main(String[] args){
        //模拟用户输入数据
        int userInputNum1 = 3;
        int userInputNum2 = 2;
        String userInputOperation = "-";

        //进行处理
        Context context = new Context(userInputNum1, userInputNum2, userInputOperation);
        String answer = context.getResult();
        System.out.println(userInputNum1 + userInputOperation + userInputNum2);
        System.out.println(answer);
    }
}
