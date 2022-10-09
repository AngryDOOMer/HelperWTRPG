package com.witcher.helper.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;
import java.util.Map;

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
    private Map<String, Integer> reputation;
    private Map<String, Integer> tranining;
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

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public void setEarlyLife(List<String> earlyLife) {
        this.earlyLife = earlyLife;
    }

    public void setLifeEvents(List<String> lifeEvents) {
        this.lifeEvents = lifeEvents;
    }

    public List<String> getCampaignNotes() {
        return campaignNotes;
    }

    public void setCampaignNotes(List<String> campaignNotes) {
        this.campaignNotes = campaignNotes;
    }

    public String getDefiningSkill() {
        return definingSkill;
    }

    public void setDefiningSkill(String definingSkill) {
        this.definingSkill = definingSkill;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getReflex() {
        return reflex;
    }

    public void setReflex(int reflex) {
        this.reflex = reflex;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getEmpathy() {
        return empathy;
    }

    public void setEmpathy(int empathy) {
        this.empathy = empathy;
    }

    public int getCraft() {
        return craft;
    }

    public void setCraft(int craft) {
        this.craft = craft;
    }

    public int getWill() {
        return will;
    }

    public void setWill(int will) {
        this.will = will;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public int getTempLuck() {
        return tempLuck;
    }

    public void setTempLuck(int tempLuck) {
        this.tempLuck = tempLuck;
    }

    public int getImprovementPoints() {
        return improvementPoints;
    }

    public void setImprovementPoints(int improvementPoints) {
        this.improvementPoints = improvementPoints;
    }

    public int getTempStamina() {
        return tempStamina;
    }

    public void setTempStamina(int tempStamina) {
        this.tempStamina = tempStamina;
    }

    public int getTempHP() {
        return tempHP;
    }

    public void setTempHP(int tempHP) {
        this.tempHP = tempHP;
    }

    public Map<String, Integer> getReputation() {
        return reputation;
    }

    public void setReputation(Map<String, Integer> reputation) {
        this.reputation = reputation;
    }

    public Map<String, Integer> getTranining() {
        return tranining;
    }

    public void setTranining(Map<String, Integer> tranining) {
        this.tranining = tranining;
    }

    public int getAwareness() {
        return awareness;
    }

    public void setAwareness(int awareness) {
        this.awareness = awareness;
    }

    public int getBusiness() {
        return business;
    }

    public void setBusiness(int business) {
        this.business = business;
    }

    public int getDeduction() {
        return deduction;
    }

    public void setDeduction(int deduction) {
        this.deduction = deduction;
    }

    public int getEducation() {
        return education;
    }

    public void setEducation(int education) {
        this.education = education;
    }

    public int getCommonSpeech() {
        return commonSpeech;
    }

    public void setCommonSpeech(int commonSpeech) {
        this.commonSpeech = commonSpeech;
    }

    public int getElderSpeech() {
        return elderSpeech;
    }

    public void setElderSpeech(int elderSpeech) {
        this.elderSpeech = elderSpeech;
    }

    public int getDwarven() {
        return dwarven;
    }

    public void setDwarven(int dwarven) {
        this.dwarven = dwarven;
    }

    public int getMonsterLore() {
        return monsterLore;
    }

    public void setMonsterLore(int monsterLore) {
        this.monsterLore = monsterLore;
    }

    public int getSocialEtiquette() {
        return socialEtiquette;
    }

    public void setSocialEtiquette(int socialEtiquette) {
        this.socialEtiquette = socialEtiquette;
    }

    public int getStreetwise() {
        return streetwise;
    }

    public void setStreetwise(int streetwise) {
        this.streetwise = streetwise;
    }

    public int getTactics() {
        return tactics;
    }

    public void setTactics(int tactics) {
        this.tactics = tactics;
    }

    public int getTeaching() {
        return teaching;
    }

    public void setTeaching(int teaching) {
        this.teaching = teaching;
    }

    public int getWildernessSurvival() {
        return wildernessSurvival;
    }

    public void setWildernessSurvival(int wildernessSurvival) {
        this.wildernessSurvival = wildernessSurvival;
    }

    public int getBrawling() {
        return brawling;
    }

    public void setBrawling(int brawling) {
        this.brawling = brawling;
    }

    public int getDodge() {
        return dodge;
    }

    public void setDodge(int dodge) {
        this.dodge = dodge;
    }

    public int getMelee() {
        return melee;
    }

    public void setMelee(int melee) {
        this.melee = melee;
    }

    public int getRiding() {
        return riding;
    }

    public void setRiding(int riding) {
        this.riding = riding;
    }

    public int getSailing() {
        return sailing;
    }

    public void setSailing(int sailing) {
        this.sailing = sailing;
    }

    public int getSmallBlades() {
        return smallBlades;
    }

    public void setSmallBlades(int smallBlades) {
        this.smallBlades = smallBlades;
    }

    public int getSpear() {
        return spear;
    }

    public void setSpear(int spear) {
        this.spear = spear;
    }

    public int getSwordsmanship() {
        return swordsmanship;
    }

    public void setSwordsmanship(int swordsmanship) {
        this.swordsmanship = swordsmanship;
    }

    public int getArchery() {
        return archery;
    }

    public void setArchery(int archery) {
        this.archery = archery;
    }

    public int getAthletics() {
        return athletics;
    }

    public void setAthletics(int athletics) {
        this.athletics = athletics;
    }

    public int getCrossbow() {
        return crossbow;
    }

    public void setCrossbow(int crossbow) {
        this.crossbow = crossbow;
    }

    public int getSlieghtOfHand() {
        return slieghtOfHand;
    }

    public void setSlieghtOfHand(int slieghtOfHand) {
        this.slieghtOfHand = slieghtOfHand;
    }

    public int getStealth() {
        return stealth;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }

    public int getPhysique() {
        return physique;
    }

    public void setPhysique(int physique) {
        this.physique = physique;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getDeceit() {
        return deceit;
    }

    public void setDeceit(int deceit) {
        this.deceit = deceit;
    }

    public int getFineArts() {
        return fineArts;
    }

    public void setFineArts(int fineArts) {
        this.fineArts = fineArts;
    }

    public int getGambling() {
        return gambling;
    }

    public void setGambling(int gambling) {
        this.gambling = gambling;
    }

    public int getGroomingAndStyle() {
        return groomingAndStyle;
    }

    public void setGroomingAndStyle(int groomingAndStyle) {
        this.groomingAndStyle = groomingAndStyle;
    }

    public int getHumanPerception() {
        return humanPerception;
    }

    public void setHumanPerception(int humanPerception) {
        this.humanPerception = humanPerception;
    }

    public int getLeadreship() {
        return leadreship;
    }

    public void setLeadreship(int leadreship) {
        this.leadreship = leadreship;
    }

    public int getPersuasion() {
        return persuasion;
    }

    public void setPersuasion(int persuasion) {
        this.persuasion = persuasion;
    }

    public int getPerfomance() {
        return perfomance;
    }

    public void setPerfomance(int perfomance) {
        this.perfomance = perfomance;
    }

    public int getSeduction() {
        return seduction;
    }

    public void setSeduction(int seduction) {
        this.seduction = seduction;
    }

    public int getAlchemy() {
        return alchemy;
    }

    public void setAlchemy(int alchemy) {
        this.alchemy = alchemy;
    }

    public int getCrafting() {
        return crafting;
    }

    public void setCrafting(int crafting) {
        this.crafting = crafting;
    }

    public int getDisguise() {
        return disguise;
    }

    public void setDisguise(int disguise) {
        this.disguise = disguise;
    }

    public int getFirstAid() {
        return firstAid;
    }

    public void setFirstAid(int firstAid) {
        this.firstAid = firstAid;
    }

    public int getForgery() {
        return forgery;
    }

    public void setForgery(int forgery) {
        this.forgery = forgery;
    }

    public int getPickLock() {
        return pickLock;
    }

    public void setPickLock(int pickLock) {
        this.pickLock = pickLock;
    }

    public int getTrapCrafting() {
        return trapCrafting;
    }

    public void setTrapCrafting(int trapCrafting) {
        this.trapCrafting = trapCrafting;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public int getHexWeaving() {
        return hexWeaving;
    }

    public void setHexWeaving(int hexWeaving) {
        this.hexWeaving = hexWeaving;
    }

    public int getIntimidation() {
        return intimidation;
    }

    public void setIntimidation(int intimidation) {
        this.intimidation = intimidation;
    }

    public int getSpellCasting() {
        return spellCasting;
    }

    public void setSpellCasting(int spellCasting) {
        this.spellCasting = spellCasting;
    }

    public int getResistMagic() {
        return resistMagic;
    }

    public void setResistMagic(int resistMagic) {
        this.resistMagic = resistMagic;
    }

    public int getResistCoercion() {
        return resistCoercion;
    }

    public void setResistCoercion(int resistCoercion) {
        this.resistCoercion = resistCoercion;
    }

    public int getRitualCrafting() {
        return ritualCrafting;
    }

    public void setRitualCrafting(int ritualCrafting) {
        this.ritualCrafting = ritualCrafting;
    }

    public List<Armor> getArmors() {
        return armors;
    }

    public void setArmors(List<Armor> armors) {
        this.armors = armors;
    }

    public List<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(List<Weapon> weapons) {
        this.weapons = weapons;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public void setInventory(List<Item> inventory) {
        this.inventory = inventory;
    }

    public List<Spell> getSpells() {
        return spells;
    }

    public void setSpells(List<Spell> spells) {
        this.spells = spells;
    }

    public List<Hex> getHexes() {
        return hexes;
    }

    public void setHexes(List<Hex> hexes) {
        this.hexes = hexes;
    }

    public List<Ritual> getRituals() {
        return rituals;
    }

    public void setRituals(List<Ritual> rituals) {
        this.rituals = rituals;
    }

    public int getCrowns() {
        return crowns;
    }

    public void setCrowns(int crowns) {
        this.crowns = crowns;
    }

    public int getVigor() {
        return vigor;
    }

    public void setVigor(int vigor) {
        this.vigor = vigor;
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
