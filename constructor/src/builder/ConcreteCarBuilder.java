package builder;

/**
 * Created by Administrator on 2019/12/24.
 * 具体汽车建造类
 */
public class ConcreteCarBuilder extends CarBuilder {

    private Car car = new Car();

    @Override
    public Car buildTire(int num) {
        car.setTireNum(num);
        return car;
    }

    @Override
    public Car buildPower(String type) {
        car.setPowerType(type);
        return car;
    }

    @Override
    public Car create() {
        return car;
    }
}
