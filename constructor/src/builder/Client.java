package builder;

/**
 * Created by Administrator on 2019/12/24.
 * 建造者模式
 */
public class Client {

    public static void main(String[] args){
        //选择指挥者
        RoadsterCarDirector roadsterCarDirector = new RoadsterCarDirector();
        //指挥者进行构建得到产品
        Car myCar = roadsterCarDirector.construct(4, "油电混合动力");
        System.out.print(myCar.toString());
    }
}
