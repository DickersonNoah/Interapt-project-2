package com.example.workoutapp.model;

import javax.persistence.*;

@Entity
@Table(name = "WorkoutGenerator")
public class WorkoutGenerator {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long WGid;

    @Column
    private Integer sets;

    @Column
    private Integer reps;

    @ManyToOne
    @JoinColumn(name = "MuscleGroups")
    private MuscleGroups muscleGroups;

    @ManyToOne
    @JoinColumn(name = "Equipment")
    private EquipmentUsed equipmentUsed;

    @ManyToOne
    @JoinColumn(name = "categories")
    private TypeOfWorkout typeOfWorkout;

    public WorkoutGenerator() {
    }

    public WorkoutGenerator(Long WGid, Integer sets, Integer reps, MuscleGroups muscleGroups, EquipmentUsed equipmentUsed, TypeOfWorkout typeOfWorkout) {
        this.WGid = WGid;
        this.sets = sets;
        this.reps = reps;
        this.muscleGroups = muscleGroups;
        this.equipmentUsed = equipmentUsed;
        this.typeOfWorkout = typeOfWorkout;
    }

    public Long getWGid() {
        return WGid;
    }

    public void setWGid(Long WGid) {
        this.WGid = WGid;
    }

    public Integer getSets() {
        return sets;
    }

    public void setSets(Integer sets) {
        this.sets = sets;
    }

    public Integer getReps() {
        return reps;
    }

    public void setReps(Integer reps) {
        this.reps = reps;
    }

    public MuscleGroups getMuscleGroups() {
        return muscleGroups;
    }

    public void setMuscleGroups(MuscleGroups muscleGroups) {
        this.muscleGroups = muscleGroups;
    }

    public EquipmentUsed getEquipmentUsed() {
        return equipmentUsed;
    }

    public void setEquipmentUsed(EquipmentUsed equipmentUsed) {
        this.equipmentUsed = equipmentUsed;
    }

    public TypeOfWorkout getTypeOfWorkout() {
        return typeOfWorkout;
    }

    public void setTypeOfWorkout(TypeOfWorkout typeOfWorkout) {
        this.typeOfWorkout = typeOfWorkout;
    }

    @Override
    public String toString() {
        return "WorkoutGenerator{" +
                "WGid=" + WGid +
                ", typeOfWorkout=" + typeOfWorkout +
                ", muscleGroups=" + muscleGroups +
                ", sets=" + sets +
                ", reps=" + reps +
                ", equipment recommended=" + equipmentUsed +
                '}';
    }
}
