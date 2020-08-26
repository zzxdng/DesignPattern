package decorator;

/**
 * Created by Administrator on 2020/8/27.
 */
public class ConcreteDecoratorA extends Decorator {

    private void decorateA(){
        System.out.print("穿着上衣\t");
    }

    public void operation(){
        super.operation();
        decorateA();
    }



}
