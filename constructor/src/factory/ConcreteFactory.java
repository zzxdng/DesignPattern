package factory;

/**
 * Created by Administrator on 2019/12/24.
 * 对应具体生成产品的工厂类
 */
public class ConcreteFactory extends Factory {
    @Override
    Product createProduct(String type) {
        return new ConcreteProduct();
    }
}
