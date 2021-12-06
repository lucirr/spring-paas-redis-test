package com.crossent.paastest.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

// reference: https://docs.spring.io/spring-session/docs/1.4.x-SNAPSHOT/reference/html5/guides/java-redis.html

@EnableRedisHttpSession
public class RedisConfig { //extends AbstractHttpSessionApplicationInitializer {
    @Value("${spring.redis.host:}")
    private String host;

    @Value("${spring.redis.port:}")
    private int port;

    @Value("${spring.redis.password:}")
    private String password;

    @Bean
    public LettuceConnectionFactory redisConnectionFactory() {
        LettuceConnectionFactory lettuceConnectionFactory = new LettuceConnectionFactory(host, port);
        lettuceConnectionFactory.setPassword(password);
        return lettuceConnectionFactory;
    }

}
