/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLibs;

public class Client extends Person{
    private String signature;
    
    public Client (String fName, String lName, String signature) {
        super(fName, lName);
        this.signature = signature;
    }
    
    // Getters
    public String getSignature() {
        return this.signature;
    }
    public String getFullName() {
        return this.firstName+" "+this.lastName;
    }
    // Setters
    public void setSignature(String signature) {
        this.signature = signature;
    }
    
}
