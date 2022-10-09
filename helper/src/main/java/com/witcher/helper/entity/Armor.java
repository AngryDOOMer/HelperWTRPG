package com.witcher.helper.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Armor {
    @GeneratedValue
    @Id
    private long id;
    private String armorType;
    private int stoppingPower; //SP - или Пункты Брони
    private int damage; //getted
}
