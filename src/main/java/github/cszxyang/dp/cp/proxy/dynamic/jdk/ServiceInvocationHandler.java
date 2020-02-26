package github.cszxyang.dp.cp.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author cszxyang
 */
public class ServiceInvocationHandler implements InvocationHandler {

    private Object target;

    public ServiceInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("do some logging....");
        method.invoke(target, args);
        System.out.println("do some other stuffs....");
        return null;
    }
}
