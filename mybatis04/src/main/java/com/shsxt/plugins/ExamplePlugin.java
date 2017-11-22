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
	 * �������з���
	 */
	 method="query",
	 /**
	 * ��������
	 */
	 
	args={MappedStatement.class,Object.class,RowBounds.class,ResultHandler.class}
	 )
	})
	public class ExamplePlugin implements Interceptor {
	 
	 /**
	 * ÿ���������ʵ��������������
	 */
	 /**
	 * Object intercept(Invocation invocation)��ʵ�������߼��ĵط���
	 * �ڲ�Ҫͨ�� invocation.proceed()��ʽ���ƽ�������ǰ����Ҳ���ǵ�����һ����
	��������Ŀ�귽����
	 */
	 public Object intercept(Invocation invocation) throws Throwable {
	 System.out.println("intercept");
	 return invocation.proceed();
	 }
	 
	 /**
	 * Object plugin(Object target) �����õ�ǰ������������ɶ�Ŀ�� target �Ĵ�
	��
	 * ʵ����ͨ�� Plugin.wrap(target,this) ����ɵģ���Ŀ�� target �������� this
	�����˰�װ������
	 */
	 public Object plugin(Object target) {
	 return Plugin.wrap(target, this);
	 }
	 
	 /**
	 * setProperties(Properties properties)�������ö���Ĳ���������������������
	 �� Properties �ڵ��
	  */
	  public void setProperties(Properties properties) {
	  System.out.println(properties.get("hello"));
	  }
	 }