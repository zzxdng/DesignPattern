package builder;

/**
 * Created by Administrator on 2019/12/24.
 * 建造跑车的指挥类
 */
public class RoadsterCarDirector {
    private CarBuilder carBuilder = new ConcreteCarBuilder();

    //默认构建选项
    public Car construct(){
        return construct(4, "汽油发动机");
    }

    //自定义构建选项
    public Car construct(int tireNum, String powerTyp){
        carBuilder.buildTire(tireNum);
        carBuilder.buildPower(powerTyp);
        return carBuilder.create();
    }

}
