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
public class IntegerInputAdapter implements IntegerInput {
    private Input input;

    public IntegerInputAdapter(Input input) {
        this.input = input;
    }

    public int readInt(String prompt) {
        try {
            return Integer.parseInt(input.readData(prompt));
        } catch (Exception e) {
            return 0;
        }
    }
}
