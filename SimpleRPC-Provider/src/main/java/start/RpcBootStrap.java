package start;

import rpc.RpcProvider;
import service.BatterCakeService;
import service.BatterCakeServiceImpl;

public class RpcBootStrap {
    public static void main(String[] args) {
        BatterCakeService batterCakeService =new BatterCakeServiceImpl();

        try {
            RpcProvider.export(20006,batterCakeService);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
