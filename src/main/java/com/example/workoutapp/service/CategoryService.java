package  com.example.workoutapp.service;

import com.example.workoutapp.exceptions.InformationExistException;
import com.example.workoutapp.exceptions.InformationNotFoundException;
import com.example.workoutapp.model.TypeOfWorkout;
import com.example.workoutapp.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.List;
import java.util.Optional;


@Service
public class CategoryService {

    private CategoryRepository categoryRepository;


    @Autowired
    public void setCategoryRepository(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<TypeOfWorkout> getTypes() {
        return categoryRepository.findAll();
    }

    public Optional getType(Long categoryId) {
        Optional category = categoryRepository.findById(categoryId);
        if (category.isPresent()) {
            return category;
        } else {
            throw new InformationNotFoundException("category with id " + categoryId + " not found");
        }
    }

    public TypeOfWorkout createType(TypeOfWorkout categoryObject) {
        System.out.println("service calling createCategory ==>");
        TypeOfWorkout category = categoryRepository.findByName(categoryObject.getName());
        if (category != null) {
            throw new InformationExistException("category with name " + category.getName() + " already exists");
        } else {
            return categoryRepository.save(categoryObject);
        }
    }


    public Optional<TypeOfWorkout> deleteType(Long categoryId) {
        System.out.println("service calling deleteCategory ==>");
        Optional<TypeOfWorkout> category = categoryRepository.findById(categoryId);
        if (category.isPresent()) {
            categoryRepository.deleteById(categoryId);
            return category;
        } else {
            throw new InformationNotFoundException("category with id " + categoryId + " not found");
        }
    }















}