package com.czb;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.czb.entity.UserEntity;
import com.czb.enums.SexEnum;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
	
	
	@Autowired
	private com.czb.mapper.UserMapper UserMapper;
 
	@Test
	public void testInsert() throws Exception {
		UserMapper.insert(new UserEntity("aa", "a123456", SexEnum.MAN));
		UserMapper.insert(new UserEntity("bb", "b123456", SexEnum.WOMAN));
		UserMapper.insert(new UserEntity("cc", "b123456", SexEnum.WOMAN));
 
		Assert.assertEquals(3, UserMapper.getAll().size());
	}
 
	@Test
	public void testQuery() throws Exception {
		List<UserEntity> users = UserMapper.getAll();
		System.out.println(users.toString());
	}
	
	@Test
	public void testUpdate() throws Exception {
		UserEntity user = UserMapper.getOne(11L);
		System.out.println(user.toString());
		user.setNickName("czb");
		UserMapper.update(user);
		Assert.assertTrue(("czb".equals(UserMapper.getOne(11l).getNickName())));
	}
	
	@Test
	public void testDelete() throws Exception {
		UserMapper.delete(11L);
	}

}
