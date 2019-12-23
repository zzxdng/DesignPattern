package factory;

/**
 * Created by Administrator on 2019/12/24.
 * 构建的具体产品类
 */
public class ConcreteProduct extends Product {
    @Override
    public void operation() {
        System.out.print("使用了 ConcreteProduct");
    }
}
