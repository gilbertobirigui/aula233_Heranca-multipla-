/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package devices;

/**
 *
 * @author Ilha Edição
 */
public class ComboDevice extends Device implements Scanner, Printer {

    public ComboDevice(String serialNumber) {
        super(serialNumber);
    }

    
    
    
    @Override
    public void processDoc(String doc) {
        System.out.println("Combo processing" + doc);
    }

    @Override
    public String Scan() {
        return "Combo scan result";
    }

    @Override
    public void print(String doc) {
        System.out.println("Combo printing: " + doc);
    }
    
  
    
}
