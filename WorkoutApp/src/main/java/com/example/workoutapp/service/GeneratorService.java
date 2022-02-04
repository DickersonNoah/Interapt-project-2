package com.example.workoutapp.service;

import com.example.workoutapp.exceptions.InformationNotFoundException;
import com.example.workoutapp.model.WorkoutGenerator;
import com.example.workoutapp.repository.GeneratorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class GeneratorService {
    private GeneratorRepository generatorRepository;

            public void setGeneratorRepository(GeneratorRepository generatorRepository){
                this.generatorRepository = generatorRepository;
            }

    public Optional getWorkout(Long workoutId) {
        Optional equipment = generatorRepository.findById(workoutId);
        if (equipment.isPresent()) {
            return equipment;
        } else {
            throw new InformationNotFoundException("category with id " + workoutId + " not found");
        }
    }

    public List<WorkoutGenerator> getWorkouts() {
                return generatorRepository.findAll();
    }
}
