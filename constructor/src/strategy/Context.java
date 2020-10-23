package strategy;

/**
 * Created by Administrator on 2020/10/24.
 * 处理策略类
 * 注：其实可以用简单工厂模式对构造部分进行分离，但由于体现策略类，遂不做补充
 */
public class Context {

    private Algorithm algorithm;

    public Context(int num1, int num2, String operation) {
        switch (operation){
            case "+":
                this.algorithm = new AddAlgorithm(num1, num2);
                break;
            case "-":
                this.algorithm = new SubAlgorithm(num1, num2);
                break;
        }
    }

    public String getResult(){
        if(algorithm != null){
            return "结果是："+algorithm.getResult();
        }else {
            return "未知错误！";
        }
    }
}
