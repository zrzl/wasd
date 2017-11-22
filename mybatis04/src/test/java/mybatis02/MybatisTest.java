package mybatis02;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.shsxt.dao.UserDao;
import com.shsxt.dao.impl.UserDaoImpl;
import com.shsxt.vo.User;

public class MybatisTest {
	private SqlSessionFactory factory;
	@Before
	public void  Init() throws IOException{
		InputStream is=Resources.getResourceAsStream("mybatis.xml");
		factory=new SqlSessionFactoryBuilder().build(is);
	} 
	
	
	
	@Test
	public void test() throws IOException {
		UserDao userDao=new UserDaoImpl(factory);
		User user=userDao.queryUserById(1);
		System.out.println(user);
	}

	@Test
	public void test1() throws IOException {
		UserDao userDao=new UserDaoImpl(factory);
		User user=userDao.queryUserByUserName("zs");
		System.out.println(user);
	}
	
	@Test
	public void test2() throws IOException {
		UserDao userDao=new UserDaoImpl(factory);
		Integer user=userDao.queryUserCount();
		System.out.println(user);
	}
	
	@Test
	public void test3() throws IOException {
		UserDao userDao=new UserDaoImpl(factory);
		User user=new User();
		user.setUserName("ls");
		user.setUserPwd("122");
		System.out.println(userDao.saveUser(user));
	}
	
	@Test
	public void test4() throws IOException {
		UserDao userDao=new UserDaoImpl(factory);
		User user=new User();
		user.setUserName("as");
		user.setUserPwd("12345");
		System.out.println(userDao.saveUserHasKey(user));
	}
	
	@Test
	public void test5() throws IOException {
		UserDao userDao=new UserDaoImpl(factory);
		User user=new User();
		user.setUserName("ws");
		user.setUserPwd("12345");
		System.out.println(userDao.saveUserHasKey02(user));
	}
	
	@Test
	public void test6() throws IOException {
		UserDao userDao=new UserDaoImpl(factory);
		List<User> users=new ArrayList<User>();
		for (int i = 12; i <=17; i++) {
			User user=new User();
			user.setUserName("wu"+i);
			user.setUserPwd("123456");
			users.add(user);
		}
		System.out.println(userDao.saveUserBatch(users));
	}
}
