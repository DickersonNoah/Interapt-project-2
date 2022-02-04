package com.example.workoutapp.controller;


import com.example.workoutapp.model.MuscleGroups;
import com.example.workoutapp.model.WorkoutGenerator;
import com.example.workoutapp.repository.GeneratorRepository;
import com.example.workoutapp.service.GeneratorService;
import com.example.workoutapp.service.MuscleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class GeneratorController {

    private GeneratorService generatorService;

   @Autowired
    public void setGeneratorService(GeneratorService generatorService){
        this.generatorService = generatorService;
    }

        @GetMapping("/WorkoutGenerator")
    public List<WorkoutGenerator> getWorkouts(){
        return generatorService.getWorkouts();

    }

    @GetMapping("/WorkoutGenerator/workoutId")
    public Optional getWorkout(@PathVariable Long workoutId) {
        return generatorService.getWorkout(workoutId);
    }
}
////
////
////    @PostMapping("/MuscleGroups/")
////    public MuscleGroups createMuscle(@RequestBody MuscleGroups muscleObject){
////        return MuscleService.createMuscle(muscleObject);
////    }
