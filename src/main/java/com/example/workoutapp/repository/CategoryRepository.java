package com.example.workoutapp.repository;

import com.example.workoutapp.model.TypeOfWorkout;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Qualifier(value = "Category")
@Repository
public interface CategoryRepository extends JpaRepository<TypeOfWorkout, Long> {
    TypeOfWorkout findByName(String categoryName);

    }


