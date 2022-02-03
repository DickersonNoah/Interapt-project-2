package com.example.workoutapp.controller;



import com.example.workoutapp.model.TypeOfWorkout;

import com.example.workoutapp.service.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class CategoryController {

    private CategoryService categoryService;

    @Autowired
    public void setCategoryService(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/TOWs")
    public List<TypeOfWorkout> getTypes() {
        return categoryService.getTypes();
    }

    @GetMapping(path = "/TOWs/{categoryId}")
    public Optional getType(@PathVariable Long categoryId) {
            System.out.println("calling getCategory ==>");
            return categoryService.getType(categoryId);
        }


    @PostMapping("/TOWs")
    public TypeOfWorkout createType(@RequestBody TypeOfWorkout categoryObject) {
        return categoryService.createType(categoryObject);

    }

    @DeleteMapping("/TOWs/{categoryId}")
    public Optional<TypeOfWorkout> deleteType(@PathVariable(value = "categoryId") Long categoryId) {
        return categoryService.deleteType(categoryId);
    }



}



