package rpc;

import java.lang.reflect.Proxy;

/**
 * @author ：shuaiqi.guo
 * @description ：TODO
 * @date ：2021/4/15 17:43
 */
public class RpcConsumer {
    public static <T> T getService(Class<T> clazz, String ip, int port) {
        ProxyHandler proxyHandler = new ProxyHandler(ip, port);
        return (T) Proxy.newProxyInstance(RpcConsumer.class.getClassLoader(), new Class<?>[]{clazz}, proxyHandler);
    }
}
