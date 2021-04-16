package start;

import rpc.RpcConsumer;
import service.BatterCakeService;

/**
 * @author ：shuaiqi.guo
 * @description：TODO
 * @date ：2021/4/15 17:44
 */
public class RpcTest {
    public static void main(String[] args) {
        BatterCakeService batterCakeService = RpcConsumer.getService(BatterCakeService.class, "127.0.0.1", 20006);
        String result = batterCakeService.sellBatterCake("双蛋");
        System.out.println(result);
    }
}
