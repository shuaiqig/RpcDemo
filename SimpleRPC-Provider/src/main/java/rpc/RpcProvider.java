package rpc;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.List;

/**
 * @author ：shuaiqi.guo
 * @description： RPC服务提供器
 * @date ：2021/4/15 16:44
 */
public class RpcProvider {

    //存储注册的服务列表
    private static List<Object> serviceList;

    /**
     * @param
     * @return
     * @author:  shuaiqi.guo
     * @description: TODO
     * @date: 2021/4/15 16:57
     */
    public static void export(int port, Object... services) throws Exception {
        serviceList = Arrays.asList(services);
        ServerSocket server = new ServerSocket(port);
        Socket client = null;
        while (true) {
            //阻塞等待输入
            client = server.accept();
            //每一个请求，启动一个线程处理
            new Thread(new ServerThread(client, serviceList)).start();
        }
    }
}
