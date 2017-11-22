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
		//���������ļ�
	InputStream is=Resources.getResourceAsStream("mybatis.xml");
	//����SqlSessionFatory
	SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
	//��ȡSqlSession
	SqlSession session=factory.openSession();
	//ִ�в�ѯ
	//User user=session.selectOne("com.shsxt.mapper.UserMapper.queryUserById",1);
	UserQuery user=session.selectOne("com.shsxt.mapper.UserMapper.queryUserById",1);
	//�ر�Sqlsession
	if (null!=user) {
		System.out.println(user);
	}
	session.close();
	
	
	
	
	
	
	
	
	
	}

	
}
