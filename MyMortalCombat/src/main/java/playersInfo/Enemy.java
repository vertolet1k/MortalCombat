/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playersInfo;

/**
 * Класс, представляющий противника в игре Mortal Combat.
 * Содержит информацию о характеристиках противника и его поведении в бою.
 * 
 * @author vika
 * @version 1.0
 */
public class Enemy {
    /** Тип противника */
    private String type;
    /** Имя противника */
    private String name;
    /** Текущее здоровье */
    private int health;
    /** Максимальное здоровье */
    private int maxHealth;
    /** Уровень атаки */
    private int attack;
    /** Тип поведения в бою */
    private int behaviorType;
    /** Флаг защиты */
    private boolean isDefending;

    /**
     * Создает нового противника с указанными характеристиками.
     * 
     * @param type тип противника
     * @param name имя противника
     * @param maxHealth максимальное здоровье
     * @param attack уровень атаки
     * @param behaviorType тип поведения в бою
     */
    public Enemy(String type, String name, int maxHealth, int attack, int behaviorType) {
        this.type = type;
        this.name = name;
        this.maxHealth = maxHealth;
        this.health = maxHealth;
        this.attack = attack;
        this.behaviorType = behaviorType;
        this.isDefending = false;
    }

    /**
     * Возвращает тип противника.
     * 
     * @return тип противника
     */
    public String getType() {
        return type;
    }

    /**
     * Возвращает имя противника.
     * 
     * @return имя противника
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает текущее здоровье противника.
     * 
     * @return текущее здоровье
     */
    public int getHealth() {
        return health;
    }

    /**
     * Устанавливает здоровье противника.
     * Здоровье не может быть меньше 0 или больше максимального.
     * 
     * @param health новое значение здоровья
     */
    public void setHealth(int health) {
        this.health = Math.max(0, Math.min(health, maxHealth));
    }

    /**
     * Возвращает максимальное здоровье противника.
     * 
     * @return максимальное здоровье
     */
    public int getMaxHealth() {
        return maxHealth;
    }

    /**
     * Возвращает уровень атаки противника.
     * 
     * @return уровень атаки
     */
    public int getAttack() {
        return attack;
    }

    /**
     * Возвращает тип поведения противника в бою.
     * 
     * @return тип поведения
     */
    public int getBehaviorType() {
        return behaviorType;
    }

    /**
     * Проверяет, находится ли противник в защите.
     * 
     * @return true, если противник в защите
     */
    public boolean isDefending() {
        return isDefending;
    }

    /**
     * Устанавливает состояние защиты противника.
     * 
     * @param defending новое состояние защиты
     */
    public void setDefending(boolean defending) {
        isDefending = defending;
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
