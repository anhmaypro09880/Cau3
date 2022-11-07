package com.example.cau3.repository;

import com.example.cau3.entity.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Repository
public class PassengerRepository {
    @Autowired
    private RedisTemplate redisTemplate;
    public Passenger save(Passenger p) {
        redisTemplate.opsForHash().put("Passenger", p.getPassId(), p);
        return p;
    }

    public List<Passenger> findAll(){
        System.out.println("Call from DB");
        List<Passenger> list = redisTemplate.opsForHash().values("Passenger");
        return redisTemplate.opsForHash().values("Passenger");
    }


}
