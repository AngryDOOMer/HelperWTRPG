package com.witcher.helper.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Weapon {
    @GeneratedValue
    @Id
    private long id;
    private String name;
    private int accuracy;
    private String damageType;
    private int reliability;
    private int hands;
    private int range;
    private String effect; //возможно нужно посадить в отдельный объект, так как может влиять на другие объекты
    private String concealability;
    private int enhancement;
    private float weight;
    private int focus;
    private int vigorModifier;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public String getDamageType() {
        return damageType;
    }

    public void setDamageType(String damageType) {
        this.damageType = damageType;
    }

    public int getReliability() {
        return reliability;
    }

    public void setReliability(int reliability) {
        this.reliability = reliability;
    }

    public int getHands() {
        return hands;
    }

    public void setHands(int hands) {
        this.hands = hands;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getConcealability() {
        return concealability;
    }

    public void setConcealability(String concealability) {
        this.concealability = concealability;
    }

    public int getEnhancement() {
        return enhancement;
    }

    public void setEnhancement(int enhancement) {
        this.enhancement = enhancement;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getFocus() {
        return focus;
    }

    public void setFocus(int focus) {
        this.focus = focus;
    }

    public int getVigorModifier() {
        return vigorModifier;
    }

    public void setVigorModifier(int vigorModifier) {
        this.vigorModifier = vigorModifier;
    }

    public Weapon() {
    }
}
