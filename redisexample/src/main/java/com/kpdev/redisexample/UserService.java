package com.kpdev.redisexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public void saveUser(User user) {
        redisTemplate.opsForValue().set(user.getId(), user);
    }

    public User getUser(String id) {
        return (User) redisTemplate.opsForValue().get(id);
    }

    public void deleteUser(String id) {
        redisTemplate.delete(id);
    }
}
