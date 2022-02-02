package com.example.workoutapp.repository;
import com.example.workoutapp.model.TypeOfWorkout;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface CategoryRepository extends JpaRepository<TypeOfWorkout, Long> {
    TypeOfWorkout findByName(String categoryName);

    }


