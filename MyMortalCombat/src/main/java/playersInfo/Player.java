/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playersInfo;

import java.util.ArrayList;

/**
 *
 * @author vika
 */
public class Player {
    
    private String name;
    private int level;
    private int experience;
    private int health;
    private int maxHealth;
    private int attack;
    private int experienceToNextLevel;
    private ArrayList<Item> inventory;
    private boolean defending;
    private int points;

    /**
     *
     * @param name
     */
    public Player(String name) {
        this.name = name;
        this.level = 1;
        this.experience = 0;
        this.maxHealth = 100;
        this.health = maxHealth;
        this.attack = 10;
        this.experienceToNextLevel = 100;
        this.inventory = new ArrayList<>();
        this.defending = false;
        this.points = 0;
    }

    /**
     *
     * @param points
     */
    public void setPoints(int points) {
        this.points = points;
    }

    /**
     *
     * @return
     */
    public int getPoints() {
        return points;
    }

    /**
     *
     * @param defending
     */
    public void setDefending(boolean defending) {
        this.defending = defending;
    }

    /**
     *
     * @return
     */
    public boolean isDefending() {
        return defending;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param level
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     *
     * @param experience
     */
    public void setExperience(int experience) {
        this.experience = experience;
    }

    /**
     *
     * @param health
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     *
     * @param maxHealth
     */
    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    /**
     *
     * @param attack
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }

    /**
     *
     * @param experienceToNextLevel
     */
    public void setExperienceToNextLevel(int experienceToNextLevel) {
        this.experienceToNextLevel = experienceToNextLevel;
    }

    /**
     *
     * @param inventory
     */
    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public int getLevel() {
        return level;
    }

    /**
     *
     * @return
     */
    public int getExperience() {
        return experience;
    }

    /**
     *
     * @return
     */
    public int getHealth() {
        return health;
    }

    /**
     *
     * @return
     */
    public int getMaxHealth() {
        return maxHealth;
    }

    /**
     *
     * @return
     */
    public int getAttack() {
        return attack;
    }

    /**
     *
     * @return
     */
    public int getExperienceToNextLevel() {
        return experienceToNextLevel;
    }

    /**
     *
     * @return
     */
    public ArrayList<Item> getInventory() {
        return inventory;
    }
    
    /**
     *
     * @param exp
     */
    public void addExperience(int exp) {
        this.experience += exp;
        while (this.experience >= this.experienceToNextLevel) {
            this.experience -= this.experienceToNextLevel;
            levelUp();
        }
    }
    
    /**
     *
     */
    public void levelUp() {
        this.level++;
        this.maxHealth += 20;
        this.health = this.maxHealth;
        this.attack += 5;
        this.experienceToNextLevel += 50;
    }
    
    /**
     *
     * @param pts
     */
    public void addPoints(int pts) { 
        this.points += pts; 
    }

    
}
