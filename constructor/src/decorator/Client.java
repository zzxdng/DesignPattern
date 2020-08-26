package decorator;

/**
 * Created by Administrator on 2020/8/27.
 * 装饰模式
 */
public class Client {

    public static void main(String[] args){
        Person person = new Person("菜鸟");
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA();
        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB();
        concreteDecoratorA.decorate(person);
        concreteDecoratorB.decorate(concreteDecoratorA);
        concreteDecoratorB.operation();
    }
}
