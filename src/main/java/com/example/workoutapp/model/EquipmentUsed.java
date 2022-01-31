package com.example.workoutapp.model;



import javax.persistence.*;

@Entity
@Table(name = "Equipment")
public class EquipmentUsed {
    @Id
    @Column
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long equipment_id;

    @Column
    private String environment;

    @Column
    private String equipment_used;

    public EquipmentUsed() {
    }

    public EquipmentUsed(Long equipment_id, String environment, String equipment_used) {
        this.equipment_id = equipment_id;
        this.environment = environment;
        this.equipment_used = equipment_used;
    }

    public Long getEquipment_id() {
        return equipment_id;
    }

    public void setEquipment_id(Long equipment_id) {
        this.equipment_id = equipment_id;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getEquipment_used() {
        return equipment_used;
    }

    public void setEquipment_used(String equipment_used) {
        this.equipment_used = equipment_used;
    }

    @Override
    public String toString() {
        return "EquipmentUsed{" +
                "equipment_id=" + equipment_id +
                ", environment='" + environment + '\'' +
                ", equipment used='" + equipment_used + '\'' +
                '}';
    }
}
