package github.cszxyang.dp.cp.proxy.dynamic.jdk;

import github.cszxyang.dp.cp.proxy.staticproxy.demo1.ServiceInterface;
import github.cszxyang.dp.cp.proxy.staticproxy.demo1.ServiceInterfaceImpl;

/**
 * JDk 动态代理 demo
 * @author cszxyang
 */
public class Client {
    public static void main(String[] args) {
        ServiceInterface serviceInterface = new ServiceInterfaceImpl();
        ServiceInterface proxy = (ServiceInterface) ProxyFactory.getProxy(serviceInterface);
        proxy.doSomething();
    }
}
