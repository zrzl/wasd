package mybatis01;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.lf5.util.Resource;
import org.junit.Test;

import com.shsxt.query.UserQuery;
import com.shsxt.vo.User;

public class MybatisTest {

	@Test
	public void test() throws IOException {
		//加载配置文件
	InputStream is=Resources.getResourceAsStream("mybatis.xml");
	//构建SqlSessionFatory
	SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
	//获取SqlSession
	SqlSession session=factory.openSession();
	//执行查询
	//User user=session.selectOne("com.shsxt.mapper.UserMapper.queryUserById",1);
	UserQuery user=session.selectOne("com.shsxt.mapper.UserMapper.queryUserById",1);
	//关闭Sqlsession
	if (null!=user) {
		System.out.println(user);
	}
	session.close();
	
	
	
	
	
	
	
	
	
	}

	
}
