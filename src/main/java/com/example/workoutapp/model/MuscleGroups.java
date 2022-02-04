package com.example.workoutapp.model;

import javax.persistence.*;

@Entity
@Table(name = "MuscleGroups")
public class MuscleGroups {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long muscleId;

    @Column
    private String portionOfBody;
    @Column
    private String specificMuscles;
    @Column
    private String exercise;

    public MuscleGroups() {
    }

    public MuscleGroups(Long muscleId, String portionOfBody, String specificMuscles, String exercise) {
        this.muscleId = muscleId;
        this.portionOfBody = portionOfBody;
        this.specificMuscles = specificMuscles;
        this.exercise = exercise;
    }

    public Long getMuscleId() {
        return muscleId;
    }

    public void setMuscleId(Long muscleId) {
        this.muscleId = muscleId;
    }

    public String getPortionOfBody() {
        return portionOfBody;
    }

    public void setPortionOfBody(String portionBfBody) {
        this.portionOfBody = portionOfBody;
    }

    public String getSpecificMuscles() {
        return specificMuscles;
    }

    public void setSpecificMuscles(String specificMuscles) {
        this.specificMuscles = specificMuscles;
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

    @Override
    public String toString() {
        return "MuscleGroups{" +
                "muscleid=" + muscleId +
                ", portion of the body='" + portionOfBody + '\'' +
                ", specific muscles='" + specificMuscles + '\'' +
                ", exercise='" + exercise + '\'' +
                '}';
    }
}
