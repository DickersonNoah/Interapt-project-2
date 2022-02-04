package com.example.workoutapp.repository;


import com.example.workoutapp.model.WorkoutGenerator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneratorRepository extends JpaRepository<WorkoutGenerator, Long> {



}



