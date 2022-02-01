package  com.example.workoutapp.service;

import com.example.workoutapp.exceptions.InformationNotFoundException;
import com.example.workoutapp.model.EquipmentUsed;
import com.example.workoutapp.model.TypeOfWorkout;
import com.example.workoutapp.repository.CategoryRepository;
import jdk.jfr.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private CategoryRepository categoryRepository;

    @Autowired
    public void setCategoryRepository(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }
//
//
//    public List<TypeOfWorkout> getTypeOfWorkout() {
//
//    }
//
//    public static TypeOfWorkout createTypeOfWorkout(TypeOfWorkout categoryObject) {
//    }
//
//    public static TypeOfWorkout updateTypeOfWorkout(Long categoryId, TypeOfWorkout categoryObject) {
//    }
//
//    public static String deleteTypeOfWorkout(Long categoryId) {
//    }
}