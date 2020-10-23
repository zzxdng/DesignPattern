package strategy;

/**
 * Created by Administrator on 2020/10/24.
 * 抽象策略类
 */
public abstract class Algorithm {
    int num1,num2;

    Algorithm(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    abstract int getResult();
}
