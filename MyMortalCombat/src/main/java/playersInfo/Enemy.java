/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playersInfo;

/**
 *
 * @author vika
 */
public class Enemy {
    
    private String name;
    private String type;
    private int health;
    private int maxHealth;
    private int attack;
    private int behaviorType;
    private boolean defending;

    /**
     *
     * @param name
     * @param type
     * @param maxHealth
     * @param attack
     * @param behaviorType
     */
    public Enemy(String name, String type, int maxHealth, int attack, int behaviorType) {
        this.name = name;
        this.type = type;
        this.maxHealth = maxHealth;
        this.health = maxHealth;
        this.attack = attack;
        this.behaviorType = behaviorType;
        this.defending = false;
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
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public String getType() {
        return type;
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
    public int getBehaviorType() {
        return behaviorType;
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
     * @param type
     */
    public void setType(String type) {
        this.type = type;
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
     * @param behaviorType
     */
    public void setBehaviorType(int behaviorType) {
        this.behaviorType = behaviorType;
    }
    
    
    
}
