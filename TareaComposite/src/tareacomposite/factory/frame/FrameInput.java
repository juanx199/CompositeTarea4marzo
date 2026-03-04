/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareacomposite.factory.frame;
import tareacomposite.factory.Input;
import javax.swing.JOptionPane;
/**
 *
 * @author JUANCA
 */
public class FrameInput implements Input{
    public String readData(String prompt){
        return JOptionPane.showInputDialog(prompt);
    }
}
