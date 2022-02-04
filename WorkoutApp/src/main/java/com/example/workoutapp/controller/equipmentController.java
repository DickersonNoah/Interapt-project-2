package com.example.workoutapp.controller;

import com.example.workoutapp.model.EquipmentUsed;
import com.example.workoutapp.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class equipmentController {

    private EquipmentService equipmentService;

    @Autowired
    public void setEquipmentService(EquipmentService equipmentService) {
        this.equipmentService = equipmentService;
    }


    @GetMapping("/Equipment")
    public List<EquipmentUsed> getEquipmentCategories() {
        return equipmentService.getEquipmentCategories();
    }

    @GetMapping(path = "/Equipment/{equipmentId}")
    public Optional getEquipment(@PathVariable Long equipmentId) {
        System.out.println("calling getCategory ==>");
        return equipmentService.getEquipment(equipmentId);
    }


    @PostMapping("/Equipment")
    public EquipmentUsed createEquipment(@RequestBody EquipmentUsed equipmentObject) {
        return equipmentService.createEquipment(equipmentObject);

    }

    @DeleteMapping("/Equipment/{equipmentId}")
    public Optional<EquipmentUsed> deleteEquipment(@PathVariable(value = "EquipmentId") Long equipmentId) {
        return equipmentService.deleteEquipment(equipmentId);
    }
}







