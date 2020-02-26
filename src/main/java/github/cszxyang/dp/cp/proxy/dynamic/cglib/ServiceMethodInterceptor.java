package github.cszxyang.dp.cp.proxy.dynamic.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 方法拦截其
 * @author cszxyang
 */
public class ServiceMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("do some logging");
        Object object = methodProxy.invokeSuper(o, objects);
        System.out.println("do some other stuffs");
        return object;
    }
}