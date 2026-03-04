/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareacomposite.adapters;

import tareacomposite.factory.Input;

/**
 *
 * @author JUANCA
 */
public class DoubleInputAdapter implements DoubleInput {
    private Input input;

    public DoubleInputAdapter(Input input) {
        this.input = input;
    }

    public double readDouble(String prompt) {
        try {
            return Double.parseDouble(input.readData(prompt));
        } catch (Exception e) {
            return 0.0;
        } // noshe que sea acá
    }
}
