package com.example.lesson45bl.repository;

import com.example.lesson45bl.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface CarRepository extends JpaRepository<CarEntity, Integer> {

}
