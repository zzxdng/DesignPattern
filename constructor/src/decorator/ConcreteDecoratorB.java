package decorator;

/**
 * Created by Administrator on 2020/8/27.
 */
public class ConcreteDecoratorB extends Decorator {

    private void decorateB(){
        System.out.print("穿着下装\t");
    }

    public void operation(){
        super.operation();
        decorateB();
    }



}
