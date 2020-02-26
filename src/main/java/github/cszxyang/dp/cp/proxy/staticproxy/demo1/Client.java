package github.cszxyang.dp.cp.proxy.staticproxy.demo1;

/**
 * @author cszxyang
 */
public class Client {
    public static void main(String[] args) {
        ServiceInterface serviceInterface = new ServiceInterfaceImpl();
        Proxy proxy = new Proxy(serviceInterface);
        proxy.doSomething();
    }
}
