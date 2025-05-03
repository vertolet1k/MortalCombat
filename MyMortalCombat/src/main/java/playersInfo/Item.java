/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playersInfo;

/**
 *
 * @author vika
 */
public class Item {
    
    private String name;
    private String type;
    private int effectValue;

    /**
     *
     * @param name
     * @param type
     * @param effectValue
     */
    public Item(String name, String type, int effectValue) {
        this.name = name;
        this.type = type;
        this.effectValue = effectValue;
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
     * @param effectValue
     */
    public void setEffectValue(int effectValue) {
        this.effectValue = effectValue;
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
    public int getEffectValue() {
        return effectValue;
    }
    
}
