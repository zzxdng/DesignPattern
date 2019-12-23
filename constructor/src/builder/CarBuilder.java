package builder;

/**
 * Created by Administrator on 2019/12/24.
 * 建造汽车的抽象类
 */
public abstract class CarBuilder {
    public abstract Car buildTire(int num);
    public abstract Car buildPower(String type);
    public abstract Car create();
}
