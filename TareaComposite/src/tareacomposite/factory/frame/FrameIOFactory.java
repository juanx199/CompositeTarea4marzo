/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareacomposite.factory.frame;

import tareacomposite.factory.*;

/**
 *
 * @author JUANCA
 */
public class FrameIOFactory implements IOFactory {
    @Override
    public Input createInput() {
        return new FrameInput();
    }

    @Override
    public Output createOutput() {
        return new FrameOutput();
    }
    // o public Output createOutput() return (Output) new FrameOutput();
}
