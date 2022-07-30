/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package MyLibs;

public interface Mediator {
    public void updateLotStatus(Lot lot, Client client, String status);
    public void updateLot(int blockNum, int lotNum, Lot newLot);
}
