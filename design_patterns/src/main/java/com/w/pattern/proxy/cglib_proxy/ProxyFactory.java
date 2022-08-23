package com.w.pattern.proxy.cglib_proxy;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author blue
 * @version 1.0
 */
public class ProxyFactory {

    //创建TrainStation对象
    private TrainStation trainStation = new TrainStation();

    public TrainStation getProxyObject() {

        //创建Enhancer对象
        Enhancer enhancer = new Enhancer();
        //设置父类的字节码对象
        enhancer.setSuperclass(TrainStation.class);
        //设置回调函数
        enhancer.setCallback(
                new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                //代理增强
                System.out.println("cglib代理");
                //反射访问方法
                Object obj = method.invoke(trainStation, objects);
                return obj;
            }
        }
                /*(MethodInterceptor) (o, method, objects, methodProxy) -> {
                    //代理增强
                    System.out.println("cglib代理");
                    //反射访问方法
                    Object obj = method.invoke(trainStation, objects);
                    return obj;
                }*/
        );
        //创建代理对象
        TrainStation proxyObject = (TrainStation) enhancer.create();
        return proxyObject;
    }
}
