package com.example.workoutapp.controller;


import com.example.workoutapp.model.MuscleGroups;
import com.example.workoutapp.service.MuscleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class muscleController {


    private MuscleService muscleService;

    @Autowired
    public void setMuscleService(MuscleService muscleService) {
        this.muscleService = muscleService;
    }

    @GetMapping("/MuscleGroups")
    public List<MuscleGroups> getMuscles(){
        return muscleService.getMuscles();
    }

    @GetMapping("/MuscleGroups/{muscleId}")
    public Optional getMuscle(@PathVariable Long muscleId){
        return muscleService.getMuscle(muscleId);
    }


    @PostMapping("/MuscleGroups/")
    public MuscleGroups createMuscle(@RequestBody MuscleGroups muscleObject){
        return muscleService.createMuscle(muscleObject);
    }


    @DeleteMapping("/MuscleGroups/{muscleId}")
    public Optional<MuscleGroups> deleteMuscle(@PathVariable(value = "muscleId") Long muscleId) {
        return muscleService.deleteMuscle(muscleId);
    }

}
