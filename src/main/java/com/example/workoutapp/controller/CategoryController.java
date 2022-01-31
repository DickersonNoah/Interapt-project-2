package com.example.workoutapp.controller;


import com.example.workoutapp.exceptions.InformationExistException;
import com.example.workoutapp.exceptions.InformationNotFoundException;
import com.example.workoutapp.model.TypeOfWorkout;
import com.example.workoutapp.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class CategoryController {

    private CategoryRepository categoryRepository;

    @Autowired
    public void setCategoryRepository(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("/categories")
    public List<TypeOfWorkout> getCategories() {
        System.out.println("calling getCategories ==>");
        return categoryRepository.findAll();
    }



    @GetMapping(path = "/categories/{categoryId}")
    public Optional getCategory(@PathVariable Long categoryId) {
        System.out.println("calling getCategory ==>");
        Optional category = categoryRepository.findById(categoryId);
        if (category.isPresent()) {
            return category;
        } else {
            throw new InformationNotFoundException("category with id " + categoryId + " not found");
        }
    }


    @PostMapping("/categories/")
    public TypeOfWorkout createCategory(@RequestBody TypeOfWorkout typeOfWorkoutObject) {
        System.out.println("calling createCategory ==>");

        TypeOfWorkout typeOfWorkout = categoryRepository.findByName(typeOfWorkoutObject.getName());
        if (typeOfWorkout != null) {
            throw new InformationExistException("category with name " + typeOfWorkout.getName() + " already exists");
        } else {
            return categoryRepository.save(typeOfWorkoutObject);
        }
    }


    @PutMapping("/categories/{categoryId}")
    public TypeOfWorkout updateCategory(@PathVariable(value = "categoryId") Long categoryId, @RequestBody TypeOfWorkout typeOfWorkoutObject) {
        System.out.println("calling updateCategory ==>");
        Optional<TypeOfWorkout> category = categoryRepository.findById(categoryId);
        if (category.isPresent()) {
            if (typeOfWorkoutObject.getName().equals(category.get().getName())) {
                System.out.println("Same");
                throw new InformationExistException("category " + category.get().getName() + " is already exists");
            } else {
                TypeOfWorkout updateTypeOfWorkout = categoryRepository.findById(categoryId).get();
                updateTypeOfWorkout.setName(typeOfWorkoutObject.getName());
                updateTypeOfWorkout.setDescription(typeOfWorkoutObject.getDescription());
                return categoryRepository.save(updateTypeOfWorkout);
            }
        } else {
            throw new InformationNotFoundException("category with id " + categoryId + " not found");
        }
    }

    @DeleteMapping("/categories/{categoryId}")
    public Optional<TypeOfWorkout> deleteCategory(@PathVariable(value = "categoryId") Long categoryId) {
        System.out.println("calling deleteCategory ==>");
        Optional<TypeOfWorkout> category = categoryRepository.findById(categoryId);

        if (category.isPresent()) {
            categoryRepository.deleteById(categoryId);
            return category;
        } else {
            throw new InformationNotFoundException("category with id " + categoryId + " not found");
        }
    }
}
