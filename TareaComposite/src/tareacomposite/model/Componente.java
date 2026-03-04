/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareacomposite.model;
import tareacomposite.factory.Output;
/**
 *
 * @author JUANCA
 */
public abstract class Componente implements Cloneable {
    protected String nombre;

    public abstract void mostrar(Output out, String tab);

    @Override
    public Componente clone() {
        try {
            return (Componente) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
