package github.cszxyang.dp.cp.proxy.staticproxy.demo1;

/**
 * @author cszxyang
 */
public class Proxy implements ServiceInterface {

    private ServiceInterface serviceInterface;

    public Proxy(ServiceInterface serviceInterface) {
        this.serviceInterface = serviceInterface;
    }

    public void doSomething() {
        // proxy stuffs
        System.out.println("do some logging....");

        serviceInterface.doSomething();

        // proxy stuffs
        System.out.println("do some other stuffs....");
    }
}
