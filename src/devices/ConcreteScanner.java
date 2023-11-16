/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package devices;

/**
 *
 * @author Ilha Edição
 */

// Device = dispositivo
// a classe ConcreteScanner é uma Device e tambem um scanner
public class ConcreteScanner extends Device implements Scanner {

    public ConcreteScanner(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Scanner processing: " + doc);
    }
    
    @Override
    public String Scan() {
        return "Scanned content";  // conteudo escaniado
    }
    
}
