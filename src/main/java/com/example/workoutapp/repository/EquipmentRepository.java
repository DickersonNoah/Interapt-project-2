package com.example.workoutapp.repository;

import com.example.workoutapp.model.EquipmentUsed;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipmentRepository extends JpaRepository<EquipmentUsed, Long> {
    EquipmentUsed findByName(String equipmentName);

    EquipmentUsed getEquipment(Long equipmentId);
}
