package com.shsxt.dao;

import java.util.List;

import com.shsxt.vo.User;

public interface UserDao {
	public User queryUserById(Integer id);
	
	public User queryUserByUserName(String userName);
	
	public Integer queryUserCount();
	
	public Integer saveUser(User user);
	
	public Integer saveUserHasKey(User user);
	
	public Integer saveUserHasKey02(User user);
	
	public Integer saveUserBatch(List<User> users);
}
