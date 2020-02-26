package github.cszxyang.dp.cp.proxy.dynamic.jdk;

import java.lang.reflect.Proxy;

/**
 * 生成代理对象的静态工厂
 * @author cszxyang
 */
public class ProxyFactory {

    public static Object getProxy(Object target) {

        ServiceInvocationHandler handler = new ServiceInvocationHandler(target);

        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), handler);
    }
}
