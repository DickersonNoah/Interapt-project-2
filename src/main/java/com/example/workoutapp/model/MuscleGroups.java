package com.example.workoutapp.model;

public class MuscleGroups {
    private Long muscle_id;
    private String portionofbody;
    private String specificmuscles;
    private String exercise;

    public MuscleGroups() {
    }

    public MuscleGroups(Long muscle_id, String portionofbody, String specificmuscles, String exercise) {
        this.muscle_id = muscle_id;
        this.portionofbody = portionofbody;
        this.specificmuscles = specificmuscles;
        this.exercise = exercise;
    }

    public Long getMuscle_id() {
        return muscle_id;
    }

    public void setMuscle_id(Long muscle_id) {
        this.muscle_id = muscle_id;
    }

    public String getPortionofbody() {
        return portionofbody;
    }

    public void setPortionofbody(String portionofbody) {
        this.portionofbody = portionofbody;
    }

    public String getSpecificmuscles() {
        return specificmuscles;
    }

    public void setSpecificmuscles(String specificmuscles) {
        this.specificmuscles = specificmuscles;
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
                "id=" + muscle_id +
                ", portion of the body='" + portionofbody + '\'' +
                ", specific muscles='" + specificmuscles + '\'' +
                ", exercise='" + exercise + '\'' +
                '}';
    }
}
