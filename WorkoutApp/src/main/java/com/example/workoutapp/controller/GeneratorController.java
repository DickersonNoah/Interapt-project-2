//package com.example.workoutapp.controller;
//
//
//import com.example.workoutapp.model.MuscleGroups;
//import com.example.workoutapp.model.WorkoutGenerator;
//import com.example.workoutapp.repository.GeneratorRepository;
//import com.example.workoutapp.service.MuscleService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.HashMap;
//import java.util.List;
//
//@RestController
//@RequestMapping(path = "/api/categories/{categoryId}/Equipment/{EquipmentId}/MuscleGroups/{MuscleId}")
//public class GeneratorController {
//    private GeneratorRepository generatorRepository;
//
//    @Autowired
//    public void setGeneratorRepository(GeneratorRepository generatorRepository){
//        this.generatorRepository = generatorRepository;
//    }
//    @GetMapping("/WorkoutGenerator")
//    public List<WorkoutGenerator> getCategory(@PathVariable String muscleId){
//        return null;
//    }
//
//    @GetMapping("/MuscleGroups/{MuscleId}")
//    public MuscleGroups getWorkout(@PathVariable Long workoutId){
//        return GeneratorRepository.getWorkout(workoutId);
//    }
////
////
////    @PostMapping("/MuscleGroups/")
////    public MuscleGroups createMuscle(@RequestBody MuscleGroups muscleObject){
////        return MuscleService.createMuscle(muscleObject);
////    }
////
////    @PutMapping("/MuscleGroups/{MuscleId}")
////    public MuscleGroups updateMuscle(@PathVariable(value = "MuscleId") Long muscleId, @RequestBody MuscleGroups muscleObject){
////        return MuscleService.updateMuscle(muscleId, muscleObject);
////    }
////
////    @DeleteMapping("/MuscleGroups/{MuscleId}")
////    public ResponseEntity<HashMap> deleteMuscle(@PathVariable(value = "MuscleId") Long muscleId, @RequestBody MuscleGroups muscleObject){
////        String status = MuscleService.deletMuscle(muscleObject);
////        HashMap message = new HashMap();
////        message.put("status", status);
////        return new ResponseEntity(message, HttpStatus.OK);
////    }
////
//}
//