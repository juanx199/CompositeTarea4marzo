/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareacomposite.factory.console;
import tareacomposite.factory.*;
/**
 *
 * @author JUANCA
 */
public class ConsoleIOFactory implements IOFactory {
    public Input createInput(){ return (Input) new ConsoleInput();}
    public Output createOutput(){ return (Output) new ConsoleOutput();}
}
