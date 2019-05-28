package com.czb.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.czb.entity.UserEntity;
import com.czb.enums.SexEnum;

public interface UserMapper {
	
	@Select("SELECT * FROM users")
	@Results({
		@Result(property = "sex",  column = "user_sex", javaType = SexEnum.class),
		@Result(property = "nickName", column = "nick_name")
	})
	List<UserEntity> getAll();
	
	@Select("SELECT * FROM users WHERE id = #{id}")
	@Results({
		@Result(property = "sex",  column = "user_sex", javaType = SexEnum.class),
		@Result(property = "nickName", column = "nick_name")
	})
	UserEntity getOne(Long id);
 
	@Insert("INSERT INTO users(userName,nick_name,user_sex) VALUES(#{userName}, #{nickName}, #{sex})")
	void insert(UserEntity user);
 
	@Update("UPDATE users SET userName=#{userName},nick_name=#{nickName} WHERE id =#{id}")
	void update(UserEntity user);
 
	@Delete("DELETE FROM users WHERE id =#{id}")
	void delete(Long id);

	
}
