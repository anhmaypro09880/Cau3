package com.example.cau3.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RedisHash("Passenger")
public class Passenger implements Serializable {
    @Id
    private int passId;
    private String name;
    private String address;
}
