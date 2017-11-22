package com.shsxt.plugins;

import java.util.Properties;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
@Intercepts({
	 @Signature(
	 
	 type=Executor.class,
	 /**
	 * 拦截所有方法
	 */
	 method="query",
	 /**
	 * 参数定义
	 */
	 
	args={MappedStatement.class,Object.class,RowBounds.class,ResultHandler.class}
	 )
	})
	public class ExamplePlugin implements Interceptor {
	 
	 /**
	 * 每个插件必须实现以下三个方法
	 */
	 /**
	 * Object intercept(Invocation invocation)是实现拦截逻辑的地方，
	 * 内部要通过 invocation.proceed()显式地推进责任链前进，也就是调用下一个拦
	截器拦截目标方法。
	 */
	 public Object intercept(Invocation invocation) throws Throwable {
	 System.out.println("intercept");
	 return invocation.proceed();
	 }
	 
	 /**
	 * Object plugin(Object target) 就是用当前这个拦截器生成对目标 target 的代
	理，
	 * 实际是通过 Plugin.wrap(target,this) 来完成的，把目标 target 和拦截器 this
	传给了包装函数。
	 */
	 public Object plugin(Object target) {
	 return Plugin.wrap(target, this);
	 }
	 
	 /**
	 * setProperties(Properties properties)用于设置额外的参数，参数配置在拦截器
	 的 Properties 节点里。
	  */
	  public void setProperties(Properties properties) {
	  System.out.println(properties.get("hello"));
	  }
	 }