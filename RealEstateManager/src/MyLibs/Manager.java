/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLibs;

import java.util.ArrayList;

public class Manager implements Mediator {
    private ArrayList<Block> blocks;

    
    public Manager (ArrayList<Block> blocks) {
        this.blocks = blocks;
    }
    
    //getters
    public ArrayList<Block> getArrayList() {
        return this.blocks;
    }
    
    //setters
    public void setArrayList(ArrayList<Block> blocks) {
        this.blocks = blocks;
    }
    
    
    /**
     * Updates lot status based on status input
     * @param blockNum the target block to be updated
     * @param lotNum the target lot to be updated
     * @param client the assigned customer object
     * @param status possible status inputs are "available", "reserved", "sold"
     */
    @Override
    public void updateLotStatus(int blockNum, int lotNum, Client client, String status) {
        blocks.get(blockNum-1).getLots().get(lotNum-1).setOwner(client);
        blocks.get(blockNum-1).getLots().get(lotNum-1).setStatus(status);
        
    }

    /**
     * Updates lot description by passing a new lot object
     * @param blockNum block number index
     * @param lotNum Lot number index
     * @param price price
     * @param size size
     */
    @Override
    public void updateLot(int blockNum, int lotNum, float price, float size) {
        // update lot based on index, subject to change
        // if you could think a better method let us know
        blocks.get(blockNum-1).getLots().get(lotNum-1).setPrice(price);//fix by -1 coz of the hardcoded data
        blocks.get(blockNum-1).getLots().get(lotNum-1).setSize(size);
    }
    
    /**
     * displays the report that should show all the lots and their complete information 
     * like location (block no. and lot no.) or status ("available", "sold", "reserved")
     */
    public void generateReport() {
        
    }
    
    /**
     * Generates a client, object
     * @param fname sets the client's First Name
     * @param lname sets the client's Last Name
     * @param sig sets the client's signature
     * @return new Client();
     */
    public Client generateClient(String fname, String lname, String sig) {
        return new Client(fname, lname, sig);
    }
    
    public Agent generateAgent(String fname, String lname, String user, String pw) {
        return new Agent(fname, lname, user, pw);
    }
}
