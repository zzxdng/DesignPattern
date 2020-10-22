package flyweight;

import java.util.HashMap;

/**
 * Created by Administrator on 2020/10/22.
 * 享元工厂
 */
public class GoodsFactory {
    HashMap<String, Goods> map = new HashMap();

    public Goods createGoods(String name){
        if(map.containsKey(name)){
            return map.get(name);
        }else {
            Goods goods = new Goods(name);
            map.put(name, goods);
            return goods;
        }
    }
}
