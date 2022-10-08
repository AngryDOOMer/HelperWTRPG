package com.witcher.helper.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

/*
Имя, раса, профа, стиль и жизненный путь
 */
@Entity
public class Character {

    @GeneratedValue
    @Id
    private long id;

    private String characterOwner;
    private String race;
    private Profession profession;
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
    private List<String> campaignNotes;
    private String definingSkill;
    private int intelligence;
    private int reflex;
    private int dexterity;
    private int body;
    private int empathy;
    private int craft;
    private int will;
    private int luck;
    private int tempLuck;
    private int improvementPoints;
    private int tempStamina;
    private int tempHP;
    /*
Нужно подумать, как реализовать заполнение репы и процесса обучения, так как там по сути будет цифра и зависящий текст. Через объект отдельный чтоль?
 */
    private int awareness = 0;
    private int business = 0;
    private int deduction = 0;
    private int education = 0;
    private int commonSpeech = 0;
    private int elderSpeech = 0;
    private int dwarven = 0;
    private int monsterLore = 0;
    private int socialEtiquette = 0;
    private int streetwise = 0;
    private int tactics = 0;
    private int teaching = 0;
    private int wildernessSurvival = 0;
    private int brawling = 0;
    private int dodge = 0;
    private int melee = 0;
    private int riding = 0;
    private int sailing = 0;
    private int smallBlades = 0;
    private int spear = 0;
    private int swordsmanship = 0;
    private int archery = 0;
    private int athletics = 0;
    private int crossbow = 0;
    private int slieghtOfHand = 0;
    private int stealth = 0;
    private int physique = 0;
    private int endurance = 0;
    private int charisma = 0;
    private int deceit = 0;
    private int fineArts = 0;
    private int gambling = 0;
    private int groomingAndStyle = 0;
    private int humanPerception = 0;
    private int leadreship = 0;
    private int persuasion = 0;
    private int perfomance = 0;
    private int seduction = 0;
    private int alchemy = 0;
    private int crafting = 0;
    private int disguise = 0;
    private int firstAid = 0;
    private int forgery = 0;
    private int pickLock = 0;
    private int trapCrafting = 0;
    private int courage = 0;
    private int hexWeaving = 0;
    private int intimidation = 0;
    private int spellCasting = 0;
    private int resistMagic = 0;
    private int resistCoercion = 0;
    private int ritualCrafting = 0;
    private List<Armor> armors;
    private List<Weapon> weapons;
    private List<Item> inventory;
    private List<Spell> spells;
    private List<Hex> hexes;
    private List<Ritual> rituals;
    private int crowns = 0;
    private int vigor;



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
