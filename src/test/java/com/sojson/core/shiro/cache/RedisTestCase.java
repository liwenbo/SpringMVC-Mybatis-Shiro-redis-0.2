package com.sojson.core.shiro.cache;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import redis.clients.jedis.JedisPool;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring.xml") 
public class RedisTestCase {

	@Autowired
	private JedisPool jedisPool;
	
	@Test
	public void test() {
		jedisPool.getResource().set("username", "liwenbo");
	}
}
