/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLibs;

public class Lot {
    private float size;
    private int lotNum;
    private float price;
    private String status;
    private Client owner = null;
    
    public Lot (float size, int lotNum, float price, String status) {
        this.size = size;
        this.lotNum = lotNum;
        this.price = price;
        this.status = status;
    }
    
    // Getters
    public float getSize() {
        return this.size;
    }
    
    public float getLotNum() {
        return this.lotNum;
    }
    
    public float getPrice() {
        return this.price;
    }
    
    public float getStatus() {
        return this.size;
    }
    
    public Client getOwner() {
        return this.owner;
    }
    
    // Setters
    public void setSize(float size) {
        this.size = size;
    }

    public void setLotNum(int lotNum) {
        this.lotNum = lotNum;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setStatus(String status) {
        this.size = size;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }
}
