package com.example.workoutapp.service;

import com.example.workoutapp.exceptions.InformationExistException;
import com.example.workoutapp.exceptions.InformationNotFoundException;
import com.example.workoutapp.model.EquipmentUsed;
import com.example.workoutapp.repository.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EquipmentService {
    private static EquipmentRepository equipmentRepository;

    @Autowired
    public void setEquipmentRepository(@Qualifier(value = "Equipment") EquipmentRepository equipmentRepository){
        this.equipmentRepository = equipmentRepository;
    }

    public List<EquipmentUsed> getCategories(Long categoryId){
        return equipmentRepository.findAll();
    }

    public Optional getEquipment(Long EquipmentId, Long equipmentId){
        Optional equipment = equipmentRepository.findById(EquipmentId);
        if (equipment.isPresent()){
            return equipment;
        }else{
            throw new InformationNotFoundException("equipment with id " + " not found");
        }
    }

    public static EquipmentUsed createEquipment(String categoryId, EquipmentUsed equipmentObject){
        EquipmentUsed equipment = equipmentRepository.findByName(equipmentObject.getEquipment_used());
        if(equipment != null){
            throw new InformationExistException("");
        }else{
            return equipmentRepository.save(equipmentObject);
        }
    }
//    public EquipmentUsed createEnvironment(EquipmentUsed environmentObject){
//        EquipmentUsed equipment = equipmentRepository.findByName(environmentObject.getEnvironment());
//        if(equipment != null){
//            throw new InformationExistException("");
//        }else{
//            return equipmentRepository.save(environmentObject);
//        }
//    }


}
