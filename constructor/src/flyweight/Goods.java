package flyweight;

/**
 * Created by Administrator on 2020/10/21.
 * 具体享元类
 */
public class Goods implements IGoods {

    private String goodsName;//内部状态
//    private String versionName;//外部状态

    public Goods(String goodsName) {
        this.goodsName = goodsName;
    }

    @Override
    public void showGoodsPrice(String versionName) {

        if("128GB".equals(versionName)){
            System.out.println("showGoodsPrice: "+goodsName+":"+versionName+" 价格为6799元");
        }else if("256GB".equals(versionName)){
            System.out.println("showGoodsPrice: "+goodsName+":"+versionName+"价格为7599元");
        }
    }
}
