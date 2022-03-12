package com.littlekids8;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {

    public static void main(String[] args) {

        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDao = new UserDaoImpl();
        // 创建接口实现类的代理对象
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        int r = dao.add(1,2);// 会调用增强的逻辑
        dao.update("hello");// 也会调用增强的逻辑
        System.out.println(r);
    }
}

// 创建代理对象代码
class UserDaoProxy implements InvocationHandler {

    // 需要传递被代理的对象过来（谁要增强谁就进来）
    // 有参构造传递
    private Object obj;
    public UserDaoProxy(Object obj){
        this.obj = obj;
    }
   // 增强的逻辑,invoke方法里面的逻辑，将会覆盖原来的所有方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // 原方法之前
        System.out.println("方法之前执行..."+method.getName()+": 传递的参数："+ Arrays.toString(args));

        // 原方法执行
        Object result = method.invoke(obj, args);
        // 可以通过判断method.getName()来执行不同的逻辑增强

        // 原方法之后
        System.out.println("方法执行之后..."+obj);
        return result;
    }
}
