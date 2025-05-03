/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playersInfo;

import java.util.ArrayList;

/**
 * Класс, представляющий игрока в игре Mortal Combat.
 * Содержит информацию о характеристиках игрока, его инвентаре и прогрессе.
 * 
 * @author vika
 * @version 1.0
 */
public class Player {
    
    /** Имя игрока */
    private String name;
    /** Текущее здоровье */
    private int level;
    /** Текущий опыт */
    private int experience;
    /** Текущее здоровье */
    private int health;
    /** Максимальное здоровье */
    private int maxHealth;
    /** Уровень атаки */
    private int attack;
    /** Опыт, необходимый для следующего уровня */
    private int experienceToNextLevel;
    /** Инвентарь игрока */
    private ArrayList<Item> inventory;
    /** Флаг защиты */
    private boolean defending;
    /** Количество очков */
    private int points;

    /**
     * Создает нового игрока с указанным именем.
     * Инициализирует базовые характеристики и пустой инвентарь.
     * 
     * @param name имя игрока
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
     * Возвращает имя игрока.
     * 
     * @return имя игрока
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает текущее здоровье игрока.
     * 
     * @return текущее здоровье
     */
    public int getHealth() {
        return health;
    }

    /**
     * Устанавливает здоровье игрока.
     * Здоровье не может быть меньше 0 или больше максимального.
     * 
     * @param health новое значение здоровья
     */
    public void setHealth(int health) {
        this.health = Math.max(0, Math.min(health, maxHealth));
    }

    /**
     * Возвращает максимальное здоровье игрока.
     * 
     * @return максимальное здоровье
     */
    public int getMaxHealth() {
        return maxHealth;
    }

    /**
     * Возвращает уровень атаки игрока.
     * 
     * @return уровень атаки
     */
    public int getAttack() {
        return attack;
    }

    /**
     * Возвращает текущий уровень игрока.
     * 
     * @return текущий уровень
     */
    public int getLevel() {
        return level;
    }

    /**
     * Возвращает текущий опыт игрока.
     * 
     * @return текущий опыт
     */
    public int getExperience() {
        return experience;
    }

    /**
     * Возвращает количество очков, необходимых для следующего уровня.
     * 
     * @return опыт для следующего уровня
     */
    public int getExperienceToNextLevel() {
        return experienceToNextLevel;
    }

    /**
     * Возвращает количество очков игрока.
     * 
     * @return количество очков
     */
    public int getPoints() {
        return points;
    }

    /**
     * Возвращает инвентарь игрока.
     * 
     * @return список предметов в инвентаре
     */
    public ArrayList<Item> getInventory() {
        return inventory;
    }

    /**
     * Проверяет, находится ли игрок в защите.
     * 
     * @return true, если игрок в защите
     */
    public boolean isDefending() {
        return defending;
    }

    /**
     * Устанавливает состояние защиты игрока.
     * 
     * @param defending новое состояние защиты
     */
    public void setDefending(boolean defending) {
        this.defending = defending;
    }

    /**
     * Добавляет опыт игроку.
     * При достижении необходимого количества опыта повышает уровень.
     * 
     * @param exp количество добавляемого опыта
     */
    public void addExperience(int exp) {
        this.experience += exp;
        while (this.experience >= this.experienceToNextLevel) {
            this.experience -= this.experienceToNextLevel;
            levelUp();
        }
    }
    
    /**
     * Повышает уровень игрока.
     * Увеличивает характеристики и обновляет необходимый опыт для следующего уровня.
     */
    public void levelUp() {
        this.level++;
        this.maxHealth += 20;
        this.health = this.maxHealth;
        this.attack += 5;
        this.experienceToNextLevel += 50;
    }
    
    /**
     * Добавляет очки игроку.
     * 
     * @param pts количество добавляемых очков
     */
    public void addPoints(int pts) { 
        this.points += pts; 
    }

    
}
