package proxy;

/**
 * Created by Administrator on 2019/12/25.
 * 代理控制处理类
 */
public class Proxy extends Subject {
    private RealSubject realSubject = new RealSubject();
    @Override
    public String response(String request) {
        String realMessage = realSubject.response(request);
        String proxyMessage = "处理过的" + realMessage;
        return proxyMessage;
    }
}
