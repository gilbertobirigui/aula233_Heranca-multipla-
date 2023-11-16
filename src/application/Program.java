/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import devices.ComboDevice;
import devices.ConcretePrinter;
import devices.ConcreteScanner;

/**
 *
 * @author Ilha Edição
 */
public class Program {
    
    public static void main(String[] args){
        
        ConcretePrinter p = new ConcretePrinter("1080");
        p. processDoc("My Letter"); // minha carta
        p.print("My Letter");
        
        System.out.println();
        ConcreteScanner s = new ConcreteScanner("2023");  // numero de serie
        s.processDoc("My Email");
        System.out.println("Scan result: " + s.Scan());
        
        
        System.out.println();
        ComboDevice c = new ComboDevice("2081");
        c.processDoc(" My Dissertation");
        c.print(" My dissertation");
        
        System.out.println();
        System.out.println("Scan result: " + c.Scan());
    }
    
}
