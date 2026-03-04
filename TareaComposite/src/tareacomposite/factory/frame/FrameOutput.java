/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareacomposite.factory.frame;

import tareacomposite.factory.Output;
import javax.swing.JOptionPane;

/**
 *
 * @author JUANCA
 */
public class FrameOutput implements Output {
    public void writeData(String data) {
        JOptionPane.showConfirmDialog(null, data);
        // return data?
    }
}
