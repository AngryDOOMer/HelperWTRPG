package com.witcher.helper.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

/*
Имя, раса, профа, стиль и жизненный путь
 */
@Entity
public class CharacterPersonality {

    @GeneratedValue
    @Id
    private long id;

    private String characterOwner;
    private String race;
    private String profession;
    private int age;
    private String clothing;
    private String peronality;
    private String hairStyle;
    private String affectation;
    private String valuedPerson;
    private String value;
    private String feelingOnPeople;
    private List<String> earlyLife;
    private List<String> lifeEvents;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCharacterOwner() {
        return characterOwner;
    }

    public void setCharacterOwner(String characterOwner) {
        this.characterOwner = characterOwner;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClothing() {
        return clothing;
    }

    public void setClothing(String clothing) {
        this.clothing = clothing;
    }

    public String getPeronality() {
        return peronality;
    }

    public void setPeronality(String peronality) {
        this.peronality = peronality;
    }

    public String getHairStyle() {
        return hairStyle;
    }

    public void setHairStyle(String hairStyle) {
        this.hairStyle = hairStyle;
    }

    public String getAffectation() {
        return affectation;
    }

    public void setAffectation(String affectation) {
        this.affectation = affectation;
    }

    public String getValuedPerson() {
        return valuedPerson;
    }

    public void setValuedPerson(String valuedPerson) {
        this.valuedPerson = valuedPerson;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getFeelingOnPeople() {
        return feelingOnPeople;
    }

    public void setFeelingOnPeople(String feelingOnPeople) {
        this.feelingOnPeople = feelingOnPeople;
    }

    public List<String> getEarlyLife() {
        return earlyLife;
    }

    public String getEarlyLife(int index) {
        return earlyLife.get(index);
    }

    public void addEarlyLife(String earlyLife) {
        this.earlyLife.add(earlyLife);
    }

    public List<String> getLifeEvents() {
        return lifeEvents;
    }

    public String getLifeEvents(int index) {
        return lifeEvents.get(index);
    }
    public void addLifeEvents(String lifeEvents) {
        this.lifeEvents.add(lifeEvents);
    }
}
