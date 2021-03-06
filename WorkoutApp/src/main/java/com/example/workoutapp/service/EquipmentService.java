package com.example.workoutapp.service;

import com.example.workoutapp.exceptions.InformationExistException;
import com.example.workoutapp.exceptions.InformationNotFoundException;
import com.example.workoutapp.model.EquipmentUsed;
import com.example.workoutapp.model.TypeOfWorkout;
import com.example.workoutapp.repository.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;

@Service
public class EquipmentService {
    private static EquipmentRepository equipmentRepository;

    @Autowired
    public void setEquipmentRepository(@Qualifier(value = "Equipment") EquipmentRepository equipmentRepository){
        this.equipmentRepository = equipmentRepository;
    }

    public List<EquipmentUsed> getEquipmentCategories(){
        return equipmentRepository.findAll();
    }

    public Optional getEquipment(Long equipmentId) {
        Optional equipment = equipmentRepository.findById(equipmentId);
        if (equipment.isPresent()) {
            return equipment;
        } else {
            throw new InformationNotFoundException("category with id " + equipmentId + " not found");
        }
    }

    public EquipmentUsed createEquipment(EquipmentUsed equipmentObject) {
        System.out.println("service calling createCategory ==>");
        EquipmentUsed equipment = equipmentRepository.findByEquipmentUsed(equipmentObject.getEquipmentUsed());
        if (equipment != null) {
            throw new InformationExistException("category with name " + equipmentObject.getEquipmentUsed() + " already exists");
        } else {
            return equipmentRepository.save(equipmentObject);
        }
    }


    public Optional<EquipmentUsed> deleteEquipment(Long equipmentId) {
        System.out.println("service calling deleteCategory ==>");
        Optional<EquipmentUsed> equipment = equipmentRepository.findById(equipmentId);
        if (equipment.isPresent()) {
            equipmentRepository.deleteById(equipmentId);
            return equipment;
        } else {
            throw new InformationNotFoundException("category with id " + equipmentId + " not found");
        }
    }


//    public Optional getEquipment(Long EquipmentId, Long equipmentId){
//        Optional equipment = equipmentRepository.findById(EquipmentId);
//        if (equipment.isPresent()){
//            return equipment;
//        }else{
//            throw new InformationNotFoundException("equipment with id " + equipmentId  +" not found");
//        }
//    }
////    public static EquipmentUsed createEquipment(String categoryId, EquipmentUsed equipmentObject){
//
//    public static EquipmentUsed createEquipment(Long categoryId, EquipmentUsed equipmentObject) {
////        Optional<EquipmentUsed> equipment = equipmentRepository.findById(categoryId);
//        try {
//            Optional equipment = equipmentRepository.findById(categoryId);
//            equipmentObject.setEquipmentUsed((EquipmentUsed) equipment.get());
//            return equipmentRepository.save(equipmentObject);
//        } catch (NoSuchElementException e) {
//            throw new InformationNotFoundException("category with id " + categoryId + " not found");
//        }
//

        //        if (equipment.isPresent()) {
//            if (Objects.equals(equipment.get().getEquipmentUsed(), equipmentObject.getEquipmentUsed())) {
//                throw new InformationExistException("");
//            } else {
//                return equipmentRepository.save(equipmentObject);
//            }
//        } throw new InformationNotFoundException("no category");
//    }

//    public EquipmentUsed createEnvironment(EquipmentUsed environmentObject){
//        EquipmentUsed equipment = equipmentRepository.findByName(environmentObject.getEnvironment());
//        if(equipment != null){
//            throw new InformationExistException("");
//        }else{
//            return equipmentRepository.save(environmentObject);
//        }
//    }


    }
