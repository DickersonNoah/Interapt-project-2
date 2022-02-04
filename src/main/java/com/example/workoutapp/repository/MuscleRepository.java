package com.example.workoutapp.repository;

import com.example.workoutapp.model.MuscleGroups;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
@Qualifier("muscle")
public interface MuscleRepository extends JpaRepository<MuscleGroups, Long>
{
    MuscleGroups findBySpecificMuscles(String specificMuscles);

}
