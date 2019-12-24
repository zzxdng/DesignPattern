package proxy;

/**
 * Created by Administrator on 2019/12/25.
 * 实际处理类
 */
public class RealSubject extends Subject {

    @Override
    public String response(String request) {
        return "响应内容";
    }
}
