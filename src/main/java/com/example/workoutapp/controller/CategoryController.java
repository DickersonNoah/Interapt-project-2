package com.example.workoutapp.controller;


import com.example.workoutapp.model.EquipmentUsed;
import com.example.workoutapp.model.TypeOfWorkout;
import com.example.workoutapp.repository.CategoryRepository;
import com.example.workoutapp.service.CategoryService;
import jdk.jfr.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

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
    public TypeOfWorkout getTypeOfWorkout(@PathVariable Long categoryId){
        System.out.println("calling getTypeOfWorkout ==>");
        return CategoryService.getTypeOfWorkout(categoryId);
    }

    @PostMapping("/categories/")
    public TypeOfWorkout createTypeOfWorkout(@RequestBody TypeOfWorkout categoryObject){
        System.out.println("Calling createTypeOfWorkout ===>");
        return CategoryService.createTypeOfWorkout(categoryObject);
    }

    @PutMapping("/categories/{categoryId}")
    public TypeOfWorkout updateTypeOfWorkout(@PathVariable(value = "categoryId") Long categoryId, @RequestBody TypeOfWorkout categoryObject){
        System.out.println("Calling updateTypeOfWorkout");
        return CategoryService.updateTypeOfWorkout(categoryId, categoryObject);
    }

    @DeleteMapping("/categories/{categoryId}")
    public ResponseEntity<HashMap> deleteTypeOfWorkout(@PathVariable(value = "categoryId") Long categoryId){
        System.out.println("calling DeleteTypeOfWorkout ===>");
        String status = CategoryService.deleteTypeOfWorkout(categoryId);
        HashMap message = new HashMap();
        message.put("status", status);
        return new ResponseEntity(message, HttpStatus.OK);
    }

}
