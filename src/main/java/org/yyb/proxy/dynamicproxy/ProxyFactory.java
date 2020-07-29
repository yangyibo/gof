package org.yyb.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

public class ProxyFactory {

    private final Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), (proxy, method, args) -> {
            System.out.println("JDK代理开始~~");
            return method.invoke(target, args);
        });
    }
}
