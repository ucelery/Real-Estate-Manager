/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLibs;

import java.util.ArrayList;

/**
 *
 * @author atond
 */
public class Block {
    private int blockNum;
    private ArrayList<Lot> lots;
    
    public Block(int blockNum) {
        this.blockNum = blockNum;
    }
    
    public Block(int blockNum, ArrayList<Lot> lots) {
        this.blockNum = blockNum;
        this.lots = lots;
    }
    
    // Getters
    public int getBlockNum() {
        return this.blockNum;
    }
    
    public ArrayList<Lot> getLots() {
        return this.lots;
    }
    
    // Setters
    public void setBlockNum(int blockNum) {
        this.blockNum = blockNum;
    }
    
    public void setLots(ArrayList<Lot> lots) {
        this.lots = lots;
    }
}
