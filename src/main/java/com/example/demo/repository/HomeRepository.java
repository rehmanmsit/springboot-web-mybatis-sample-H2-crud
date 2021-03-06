package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.example.demo.repository.entity.User;
import com.example.demo.repository.entity.UserRole;

@Mapper
public interface HomeRepository {
	
	@Select("SELECT * FROM user WHERE id = #{id}")
	@Results({
        @Result(id=true, property = "id", column = "ID"),
        @Result(property="role", column="role",
        one=@One(select="com.example.demo.repository.HomeRepository.findUserRoleById"))
      })
	User findUserById(Long id);
	
	@Select("SELECT * FROM user")
	@Results({
        @Result(id=true, property = "id", column = "ID"),
        @Result(property="role", column="role",
        one=@One(select="com.example.demo.repository.HomeRepository.findUserRoleById"))
      })
	List<User> fetchAllUsers();
	
	@Select("SELECT * FROM user_role WHERE id = #{id}")
	UserRole findUserRoleById(Long id);
	
	@Delete("DELETE FROM user WHERE id = #{id}")
	public int deleteUserById(long id);
	
	@Insert("INSERT INTO user(id, name, role) VALUES (#{id},#{name}, #{role.id})")
	public int insertUser(User user);
	
	//@Update("Update student set name=#{name}, passport=#{passport} where id=#{id}")
	//public int update(User user);

}
