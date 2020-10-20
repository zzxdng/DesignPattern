package facade;

/**
 * Created by Administrator on 2020/10/21.
 */
public class Client {
    public static void main(String[] args){

        Facade facade = new Facade();
        //当客户A的需求
        facade.operationSetA();
        //当客户B的需求
        facade.operationSetB();

    }
}
