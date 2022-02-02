package com.example.workoutapp.controller;


import com.example.workoutapp.exceptions.InformationExistException;
import com.example.workoutapp.exceptions.InformationNotFoundException;
import com.example.workoutapp.model.TypeOfWorkout;
import com.example.workoutapp.repository.CategoryRepository;
import com.example.workoutapp.service.CategoryService;
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

    @GetMapping("/TOWs")
    public List<TypeOfWorkout> getTypes() {
        return categoryRepository.findAll();
    }

    @GetMapping(path = "/TOWs/{categoryId}")
    public Optional getType(@PathVariable Long categoryId) {
        Optional category = categoryRepository.findById(categoryId);
        if (category.isPresent()) {
            return category;
        } else {
            throw new InformationNotFoundException("category with id " + categoryId + " not found");
        }
    }

    @PostMapping("/TOWs")
    public TypeOfWorkout createType(@RequestBody TypeOfWorkout categoryObject) {
        TypeOfWorkout category = categoryRepository.findByName(categoryObject.getName());
        if (category != null) {
            throw new InformationExistException("category with name " + category.getName() + " already exists");
        } else {
            return categoryRepository.save(categoryObject);
        }
    }

        @DeleteMapping("/TOWs/{categoryId}")
        public Optional<TypeOfWorkout> deleteType(@PathVariable(value = "categoryId") Long categoryId) {
            Optional<TypeOfWorkout> category = categoryRepository.findById(categoryId);
            if (category.isPresent()) {
                categoryRepository.deleteById(categoryId);
                return category;
            } else {
                throw new InformationNotFoundException("category with id " + categoryId + " not found");
            }
        }
    }



