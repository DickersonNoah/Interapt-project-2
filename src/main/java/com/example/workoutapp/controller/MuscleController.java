//package com.example.workoutapp.controller;
//
//
//import com.example.workoutapp.model.EquipmentUsed;
//import com.example.workoutapp.model.MuscleGroups;
//import com.example.workoutapp.repository.MuscleRepository;
//
//import com.example.workoutapp.service.MuscleService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.awt.*;
//import java.util.HashMap;
//import java.util.List;
//
//@RestController
//@RequestMapping(path = "/api/categories/{categoryId}/Equipment/{EquipmentId}")
//public class MuscleController {
//    private MuscleRepository muscleRepository;
//
//    @Autowired
//    public void setMuscleRepository(MuscleRepository muscleRepository){
//        this.muscleRepository = muscleRepository;
//    }
//
//    @GetMapping("/MuscleGroups")
//    public List<MuscleGroups> getCategory(@PathVariable String EquipmentId){
//        return muscleRepository.findAll();
//    }
//
//    @GetMapping("/MuscleGroups/{MuscleId}")
//    public MuscleGroups getMuscles(@PathVariable Long muscleId){
//        return muscleRepository.getMuscles(muscleId);
//    }
//
//
//    @PostMapping("/MuscleGroups/")
//    public MuscleGroups createMuscle(@RequestBody MuscleGroups muscleObject){
//        return MuscleService.createMuscle(muscleObject);
//    }
//
//    @PutMapping("/MuscleGroups/{MuscleId}")
//    public MuscleGroups updateMuscle(@PathVariable(value = "MuscleId") Long muscleId, @RequestBody MuscleGroups muscleObject){
//        return MuscleService.updateMuscle(muscleId, muscleObject);
//    }
//
//    @DeleteMapping("/MuscleGroups/{MuscleId}")
//    public ResponseEntity<HashMap> deleteMuscle(@PathVariable(value = "MuscleId") Long muscleId, @RequestBody MuscleGroups muscleObject){
//        String status = MuscleService.deletMuscle(muscleObject);
//        HashMap message = new HashMap();
//        message.put("status", status);
//        return new ResponseEntity(message, HttpStatus.OK);
//    }
//
//}
