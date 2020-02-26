package github.cszxyang.dp.cp.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * cglib 动态代理
 * @author cszxyang
 */
public class Client {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        // 继承被代理类
        enhancer.setSuperclass(ServiceInterfaceImpl.class);
        // 设置回调
        enhancer.setCallback(new ServiceMethodInterceptor());
        // 设置代理类对象
        ServiceInterfaceImpl service = (ServiceInterfaceImpl) enhancer.create();
        // 在调用代理类中方法时会被我们实现的方法拦截器进行拦截
        service.doSomething();
    }
}
