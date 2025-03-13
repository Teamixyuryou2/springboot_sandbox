package com.ghost.dummyproject.model;


public class Warrior {
    private String name;
    private int hp;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int agility;

    public Warrior(String name, int hp, int strength, int dexterity, int intelligence, int wisdom, int charisma, int agility) {
        this.name = name;
        this.hp = hp;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
        this.agility = agility;
    }

    public String getName() {
        return this.name;
    }

    public int getHp() {
        return this.hp;
    }

    public int getDexterity() {
        return dexterity;
    }
    public int getIntelligence() {
        return intelligence;
    }
    public int getWisdom() {
        return wisdom;
    }
    public int getCharisma() {
        return charisma;
    }
    public int getAgility() {
        return agility;
    }


    public void takeDamage(int damage) {
        this.hp -= damage;
    }
}

