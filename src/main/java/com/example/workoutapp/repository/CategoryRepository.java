package com.example.workoutapp.repository;
import com.example.workoutapp.model.EquipmentUsed;
import com.example.workoutapp.model.TypeOfWorkout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<TypeOfWorkout, Long> {
    static TypeOfWorkout findByID() {
        return null;
    }

    TypeOfWorkout findByName(String categoryName);

}
