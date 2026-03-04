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
public class ProductoSimple extends Componente {
    private double precio;

    public ProductoSimple(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public void mostrar(Output out, String tab) {
        out.writeData(tab + " - " + nombre + " [$" + precio + "]");
    }
}