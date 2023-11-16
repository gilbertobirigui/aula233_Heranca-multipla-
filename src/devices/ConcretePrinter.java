/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package devices;

/**
 *
 * @author Ilha Edição
 */
public class ConcretePrinter extends Device implements Printer {

    public ConcretePrinter(String serialNumber) {
        super(serialNumber);
    }

    
    
    @Override
    public void processDoc(String doc) {
        System.out.println("Printer processing: " + doc);
    }
    
    
    @Override
    public void print(String doc){
        System.out.println("Printing: " + doc);
    }
    
    
}
