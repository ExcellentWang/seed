package com.company.configurer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
public class RedisConfigurer<T> {
	private final Logger logger = LoggerFactory.getLogger(RedisConfigurer.class);

	@Value("${spring.redis.database}")
	private int dateBase;
	@Value("${spring.redis.host}")
	private String host;
	@Value("${spring.redis.port}")
	private int port;
	@Value("${spring.redis.password}")
	private String password;
	@Value("${spring.redis.pool.max-active}")
	private int maxTotal;
	@Value("${spring.redis.pool.max-wait}")
	private int maxWait;
	@Value("${spring.redis.pool.max-idle}")
	private int maxIdle;
	@Value("${spring.redis.pool.min-idle}")
	private int minIdle;
	@Value("${spring.redis.timeout}")
	private int timeout;

	@Bean
	JedisConnectionFactory jedisConnectionFactory() {
		JedisConnectionFactory factory = new JedisConnectionFactory();
		factory.setDatabase(dateBase);
		factory.setHostName(host);
		factory.setPort(port);
		factory.setPassword(password);
		JedisPoolConfig poolConfig = new JedisPoolConfig();
		poolConfig.setMaxIdle(maxIdle);
		poolConfig.setMinIdle(minIdle);
		poolConfig.setMaxWaitMillis(maxWait);
		poolConfig.setMaxTotal(maxTotal);
		factory.setPoolConfig(poolConfig);
		factory.setTimeout(timeout);
		if (factory==null) {
		logger.info("redis起动连接失败");
		}
		logger.info("redis起动连接成功");

		return factory;
	}

	/**
	 * RedisTemplate配置
	 * 
	 * @param factory
	 * @return
	 */
	@Bean
	public RedisTemplate<String, T> redisTemplate(RedisConnectionFactory factory) {

		RedisTemplate<String, T> template = new RedisTemplate<String, T>();
		template.setConnectionFactory(factory);
//		template.setKeySerializer(new StringRedisSerializer());
//		template.setValueSerializer(new JdkSerializationRedisSerializer());
//		template.setValueSerializer(new RedisObjectSerializer());
//		template.afterPropertiesSet();
		logger.info("redis 模板连接成功");

		return template;
	}
	
}