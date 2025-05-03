/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playersInfo;

/**
 * Класс, представляющий предмет в игре Mortal Combat.
 * Содержит информацию о предмете и его характеристиках.
 * 
 * @author vika
 * @version 1.0
 */
public class Item {
    /** Название предмета */
    private String name;
    /** Тип предмета */
    private String type;
    /** Эффективность предмета */
    private int effectiveness;

    /**
     * Создает новый предмет с указанными характеристиками.
     * 
     * @param name название предмета
     * @param type тип предмета
     * @param effectiveness эффективность предмета
     */
    public Item(String name, String type, int effectiveness) {
        this.name = name;
        this.type = type;
        this.effectiveness = effectiveness;
    }

    /**
     * Возвращает название предмета.
     * 
     * @return название предмета
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает тип предмета.
     * 
     * @return тип предмета
     */
    public String getType() {
        return type;
    }

    /**
     * Возвращает эффективность предмета.
     * 
     * @return эффективность предмета
     */
    public int getEffectiveness() {
        return effectiveness;
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
     * @param effectiveness
     */
    public void setEffectiveness(int effectiveness) {
        this.effectiveness = effectiveness;
    }
}
