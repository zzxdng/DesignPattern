package proxy;

/**
 * Created by Administrator on 2019/12/25.
 * 代理模式
 * 客户端类
 */
public class Client {

    private static Proxy proxy = new Proxy();

    public static void main(String[] args){
        request("客户端请求");
    }

    public static void request(String request){
        String result = proxy.response(request);
        System.out.print(result);
    }


}
