/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playersInfo;

/**
 *
 * @author vika
 */
public class Boss extends Enemy{
    
    /**
     *
     * @param name
     * @param maxHealth
     * @param attack
     * @param behaviorType
     */
    public Boss(String name, int maxHealth, int attack, int behaviorType) {
        super(name, "Boss", maxHealth, attack, behaviorType);
    }
    
}
