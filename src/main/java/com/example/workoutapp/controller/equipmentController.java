package com.example.workoutapp.controller;

import com.example.workoutapp.model.EquipmentUsed;
import com.example.workoutapp.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;



import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "}/api")
public class equipmentController {

    private EquipmentService equipmentService;
    @Autowired
    public void setEquipmentService(EquipmentService equipmentService) {
        this.equipmentService = equipmentService;
    }

    @GetMapping("/api/categories/{categoryId}/Equipment")
    public List<EquipmentUsed> getCategories(@PathVariable(value = "categoryId") Long categoryId) {
        System.out.println("calling getCategoryRecipes ==>");
        return equipmentService.getCategories(categoryId);
    }


    @GetMapping(path = "/api/categories/{categoryId}/Equipment/{EquipmentId}")
    public Optional getEquipment(@PathVariable(value = "categoryId") Long categoryId, @PathVariable(value = "EquipmentId") Long equipmentId) {
        System.out.println("calling getCategoryRecipe ==>");
        return equipmentService.getEquipment(categoryId, equipmentId);
    }



    @PostMapping("/api/categories/{categoryId}/Equipment")
    public EquipmentUsed createEquipment(@PathVariable(value = "categoryId") String categoryId, @RequestBody EquipmentUsed equipmentObject) {
        System.out.println("calling createCategoryRecipe ==>");
        return equipmentService.createEquipment(categoryId, equipmentObject);
    }
    }

//    @PutMapping("/Equipment/{EquipmentId}")
//    public EquipmentUsed updateEquipment(@PathVariable(value = "EquipmentId") Long EquipmentId, @RequestBody EquipmentUsed equipmentObject){
//        return EquipmentService.updateEquipment(EquipmentId, equipmentObject);
//    }
//
//    @DeleteMapping("/Equipment/{EquipmentId}")
//    public ResponseEntity<HashMap> deleteEquipment(@PathVariable(value = "EquipmentId") Long EquipmentId, @RequestBody EquipmentUsed equipmentObject){
//        String status = EquipmentService.deleteEquipment(equipmentObject);
//        HashMap message = new HashMap();
//        message.put("status", status);
//        return new ResponseEntity(message, HttpStatus.OK);
//    }

