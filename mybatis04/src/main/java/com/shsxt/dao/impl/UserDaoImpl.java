package com.shsxt.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.shsxt.dao.UserDao;
import com.shsxt.vo.User;

public class UserDaoImpl implements UserDao{
	private SqlSessionFactory factory;
	
	public UserDaoImpl(SqlSessionFactory factory) {
		super();
		this.factory = factory;
	}


	@Override
	public User queryUserById(Integer id) {
		SqlSession session=null;
		User result=null;
		try {
			session=factory.openSession();
			result=session.selectOne("com.shsxt.mapper.UserMapper.queryUserById",id);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		return result;
	}


	@Override
	public User queryUserByUserName(String userName) {
		SqlSession session=null;
		User result=null;
		try {
			session=factory.openSession();
			result=session.selectOne("com.shsxt.mapper.UserMapper.queryUserByUserName",userName);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		return result;
	}


	@Override
	public Integer queryUserCount() {
		SqlSession session=null;
		Integer result=null;
		try {
			session=factory.openSession();
			result=session.selectOne("com.shsxt.mapper.UserMapper.queryUserCount");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		return result;
	}


	@Override
	public Integer saveUser(User user) {
		SqlSession session=null;
		Integer result=null;
		try {
			session=factory.openSession(true);
			result=session.insert("com.shsxt.mapper.UserMapper.saveUser", user);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		return result;
	}


	@Override
	public Integer saveUserHasKey(User user) {
		SqlSession session=null;
		Integer result=null;
		try {
			session=factory.openSession(true);
			session.insert("com.shsxt.mapper.UserMapper.saveUserHasKey", user);
			result=user.getId();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		return result;
	}


	@Override
	public Integer saveUserHasKey02(User user) {
		SqlSession session=null;
		Integer result=null;
		try {
			session=factory.openSession(true);
			session.insert("com.shsxt.mapper.UserMapper.saveUserHasKey02", user);
			result=user.getId();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		return result;
	}


	@Override
	public Integer saveUserBatch(List<User> users) {
		SqlSession session=null;
		Integer result=null;
		try {
			session=factory.openSession(true);
			result=session.insert("com.shsxt.mapper.UserMapper.saveUserBatch", users);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		return result;
	}
	
}
