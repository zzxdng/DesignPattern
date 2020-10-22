package flyweight;

/**
 * Created by Administrator on 2020/10/21.
 */
public class Client {

    public static void main(String[] args){
        GoodsFactory factory = new GoodsFactory();
        Goods goods1 = factory.createGoods("iPhone12");
        goods1.showGoodsPrice("128GB");
        Goods goods2 = factory.createGoods("iPhone12");//获取形同实例
        goods2.showGoodsPrice("256GB");//注入不同的外部状态
    }


}
