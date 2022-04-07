package dao;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;

import java.util.Properties;

// 完成插件的签名：告诉MyBatis当前插件用来拦截哪个对象的哪个方法
@Intercepts(
        {
                /*
                 * type: 拦截四大对象的哪一个类型
                 * method:拦截对象中的哪一个方法
                 * args：拦截的方法可能有重载，需要参数来确定哪个方法
                 * */
                @Signature(type = StatementHandler.class, method = "parameterize", args = java.sql.Statement.class)
        }
)
public class MyFirstPlugin implements Interceptor {

    /**
     * interceptor:拦截
     *      拦截目标对象的目标方法的执行
     */
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println("myFirstPlugin...intercept:"+ invocation);
        // 偷梁换柱
        // 动态地改变一下sql运行的参数：以前是1号员工，现在查5号员工
        // 拦截到的对象：
        Object target = invocation.getTarget();
        System.out.println("当前拦截到的对象："+ invocation.getTarget());

        // 仅需拿到StatementHandler==》ParameterHandler==>ParameterObject

        // 可通过SystemMetaObject的forObject(target)拿到target的元数据
        MetaObject metaObject = SystemMetaObject.forObject(target);
        Object value = metaObject.getValue("parameterHandler.parameterObject");
        System.out.println("sql语句中用到的参数是："+value);
        // 修改该值
        metaObject.setValue("parameterHandler.parameterObject", 5);

        // 执行目标方法
        Object proceed = invocation.proceed();
        System.out.println("myFirstPlugin...intercept之后:"+ invocation);
        // 返回执行后的返回值
        return proceed;
    }

    /**
     *plugin: 包装目标对象
     * 包装：为目标对象创建一个代理对象
     */
    @Override
    public Object plugin(Object target) {
        // 我们可以借助Plugin的wrap方法来使用当前Interceptor包装我们目标对象
        System.out.println("myFirstPlugin...plugin:将要包装的对象"+ target);
        Object wrap = Plugin.wrap(target, this);
        // 返回当前target创建的动态代理
        return wrap;
    }

    /**
     * setProperties:
     * 将插件注册时的property属性设置进来
     */
    @Override
    public void setProperties(Properties properties) {
        System.out.println("插件配置信息："+ properties);
    }
}
