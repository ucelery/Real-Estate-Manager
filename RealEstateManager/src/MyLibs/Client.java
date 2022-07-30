/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLibs;

public class Client extends Person{
    private Agent clientAgent;
    
    public Client (String fName, String lName, Agent clientAgent) {
        super(fName, lName);
        this.clientAgent = clientAgent;
    }
    
    // Getters
    public String getAgent() {
        return this.clientAgent.getFirstName()+" "+this.clientAgent.getLastName();
    }
    
    // Setters
    public void setAgent(Agent clientAgent) {
        this.clientAgent = clientAgent;
    }
    
}
