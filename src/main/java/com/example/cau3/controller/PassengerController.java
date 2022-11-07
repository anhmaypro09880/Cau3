package com.example.cau3.controller;

import com.example.cau3.entity.Passenger;
import com.example.cau3.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PassengerController {
    @Autowired
    private PassengerRepository passengerRepository;
    @PostMapping
    public Passenger saveMayBay(@RequestBody Passenger p){
        return passengerRepository.save(p);
    }
    @GetMapping("/getAll")
    @Cacheable("AllP")
    public List<Passenger> getAllMayBay(){
        return passengerRepository.findAll();
    }

}
