package factory;

/**
 * Created by Administrator on 2019/12/20.
 */
public class Client {

    public static void main(String[] args){

        //创建工厂
        Factory concreteFactory = new ConcreteFactory();
        //使用工厂构造对应产品
        Product concreteProduct = concreteFactory.createProduct("");
        //使用构造的产品
        concreteProduct.operation();

    }

}
