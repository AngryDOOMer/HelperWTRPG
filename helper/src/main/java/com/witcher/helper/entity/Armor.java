package com.witcher.helper.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Armor {
    @GeneratedValue
    @Id
    private long id;
    private String name;
    private String armorType;
    private int stoppingPower; //SP - или Пункты Брони
    private int damage; //getted

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArmorType() {
        return armorType;
    }

    public void setArmorType(String armorType) {
        this.armorType = armorType;
    }

    public int getStoppingPower() {
        return stoppingPower;
    }

    public void setStoppingPower(int stoppingPower) {
        this.stoppingPower = stoppingPower;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Armor() {
    }
}
