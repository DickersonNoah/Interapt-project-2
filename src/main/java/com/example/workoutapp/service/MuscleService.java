package com.example.workoutapp.service;

import com.example.workoutapp.exceptions.InformationExistException;
import com.example.workoutapp.exceptions.InformationNotFoundException;
import com.example.workoutapp.model.MuscleGroups;
import com.example.workoutapp.repository.MuscleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

import java.util.Optional;

@Service
public class MuscleService {

    private static MuscleRepository muscleRepository;

    @Autowired
    public void setMuscleRepository(@Qualifier("muscle") MuscleRepository muscleRepository){
        this.muscleRepository = muscleRepository;
    }

    public List<MuscleGroups> getMuscles(){
        return muscleRepository.findAll();
    }

    public Optional getMuscle(Long muscleId) {
        Optional muscle = muscleRepository.findById(muscleId);
        if (muscle.isPresent()) {
            return muscle;
        } else {
            throw new InformationNotFoundException("category with id " + muscleId + " not found");
        }
    }


    public MuscleGroups createMuscle(MuscleGroups muscleObject){
        MuscleGroups muscle = muscleRepository.findBySpecificMuscles(muscleObject.getSpecificMuscles());
        if (muscle != null){
            throw new InformationExistException("category with name " + muscle.getSpecificMuscles() + " already exists");
        } else {
            return muscleRepository.save(muscleObject);
        }
    }



    public Optional<MuscleGroups> deleteMuscle(Long muscleId) {
        System.out.println("service calling deleteCategory ==>");
        Optional<MuscleGroups> muscle = muscleRepository.findById(muscleId);
        if (muscle.isPresent()) {
            muscleRepository.deleteById(muscleId);
            return muscle;
        } else {
            throw new InformationNotFoundException("category with id " + muscleId + " not found");
        }
    }

}
