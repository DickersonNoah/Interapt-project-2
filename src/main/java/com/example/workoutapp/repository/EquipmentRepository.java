package com.example.workoutapp.repository;

import com.example.workoutapp.model.EquipmentUsed;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
@Qualifier(value = "Equipment")
public interface EquipmentRepository extends JpaRepository<EquipmentUsed, Long> {
    EquipmentUsed findByName(String equipmentName);

}
