package strategy;

/**
 * Created by Administrator on 2020/10/24.
 * 具体策略类：减法操作
 */
public class SubAlgorithm extends Algorithm {

    SubAlgorithm(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    int getResult() {
        return num1 - num2;
    }
}
