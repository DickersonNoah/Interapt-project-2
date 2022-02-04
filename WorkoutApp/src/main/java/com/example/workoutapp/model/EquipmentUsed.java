package com.example.workoutapp.model;



import javax.persistence.*;

@Entity
@Table(name = "Equipment")
public class EquipmentUsed {
    @Id
    @Column
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long equipmentId;

    @Column
    private String environment;

    @Column
    private String equipmentUsed;

    public EquipmentUsed() {
    }

    public EquipmentUsed(Long equipmentId, String environment, String equipmentUsed) {
        this.equipmentId = equipmentId;
        this.environment = environment;
        this.equipmentUsed = equipmentUsed;
    }

    public Long getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Long equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getEquipmentUsed() {
        return equipmentUsed;
    }

    public void setEquipmentUsed(EquipmentUsed equipmentUsed) {
        this.equipmentUsed = String.valueOf(equipmentUsed);
    }

    @Override
    public String toString() {
        return "EquipmentUsed{" +
                "equipmentId=" + equipmentId +
                ", environment='" + environment + '\'' +
                ", equipmentUsed='" + equipmentUsed + '\'' +
                '}';
    }
}

