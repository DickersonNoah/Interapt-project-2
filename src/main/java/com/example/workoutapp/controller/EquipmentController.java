//package com.example.workoutapp.controller;
//
//import com.example.workoutapp.model.EquipmentUsed;
//import com.example.workoutapp.repository.EquipmentRepository;
//import com.example.workoutapp.service.EquipmentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.HashMap;
//import java.util.List;
//
//@RestController
//@RequestMapping(path = "/api/categories/{categoryId}")
//public class EquipmentController {
//
//    private EquipmentRepository equipmentRepository;
//
//    @Autowired
//    public void setEquipmentRepository(EquipmentRepository equipmentRepository){
//        this.equipmentRepository = equipmentRepository;
//    }
//
//
//    @GetMapping("/Equipment")
//    public List<EquipmentUsed> getCategory(@PathVariable String categoryId){
//        System.out.println("Calling getEquipmentCategory === >");
//        return equipmentRepository.findAll();
//    }
//
//    @GetMapping(path = "/Equipment/{EquipmentId}")
//    public EquipmentUsed getEquipment(@PathVariable Long EquipmentId){
//        System.out.println();
//        return equipmentRepository.getEquipment(EquipmentId);
//    }
//
//    @PostMapping("/Equipment/")
//    public EquipmentUsed createEquipment(@RequestBody EquipmentUsed equipmentObject){
//        System.out.println();
//        return EquipmentService.createEquipment(equipmentObject);
//    }
//
//    @PutMapping("/Equipment/{EquipmentId}")
//    public EquipmentUsed updateEquipment(@PathVariable(value = "EquipmentId") Long EquipmentId, @RequestBody EquipmentUsed equipmentObject){
//        return EquipmentService.updateEquipment(EquipmentId, equipmentObject);
//    }
//
//    @DeleteMapping("/Equipment/{EquipmentId}")
//    public ResponseEntity<HashMap> deleteEquipment(@PathVariable(value = "EquipmentId") Long EquipmentId, @RequestBody EquipmentUsed equipmentObject){
//        String status = EquipmentService.deletEquipment(equipmentObject);
//        HashMap message = new HashMap();
//        message.put("status", status);
//        return new ResponseEntity(message, HttpStatus.OK);
//    }
//}
