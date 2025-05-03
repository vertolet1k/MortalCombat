/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playersInfo;

/**
 * Класс, представляющий босса в игре Mortal Combat.
 * Наследуется от класса Enemy и имеет особые характеристики.
 * 
 * @author vika
 * @version 1.0
 */
public class Boss extends Enemy{
    
    /**
     * Создает нового босса с указанными характеристиками.
     * 
     * @param name имя босса
     * @param maxHealth максимальное здоровье
     * @param attack уровень атаки
     * @param behaviorType тип поведения в бою
     */
    public Boss(String name, int maxHealth, int attack, int behaviorType) {
        super("Босс", name, maxHealth, attack, behaviorType);
    }
    
}
