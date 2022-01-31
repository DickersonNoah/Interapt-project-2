package com.example.workoutapp.model;

public class EquipmentUsed {
    private Long equipment_id;
    private String enviroment;
    private String equipment_used;

    public EquipmentUsed() {
    }

    public EquipmentUsed(Long equipment_id, String enviroment, String equipment_used) {
        this.equipment_id = equipment_id;
        this.enviroment = enviroment;
        this.equipment_used = equipment_used;
    }

    public Long getEquipment_id() {
        return equipment_id;
    }

    public void setEquipment_id(Long equipment_id) {
        this.equipment_id = equipment_id;
    }

    public String getEnviroment() {
        return enviroment;
    }

    public void setEnviroment(String enviroment) {
        this.enviroment = enviroment;
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
                ", enviroment='" + enviroment + '\'' +
                ", equipment_used='" + equipment_used + '\'' +
                '}';
    }
}
