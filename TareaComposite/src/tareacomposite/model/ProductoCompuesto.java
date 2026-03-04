/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareacomposite.model;
import tareacomposite.factory.Output;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author JUANCA
 */
public class ProductoCompuesto extends Componente {
    private List<Componente> hijos = new ArrayList<>();

    public ProductoCompuesto(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(Componente c) {
        hijos.add(c);
    }

    @Override
    public void mostrar(Output out, String tab) {
        out.writeData(tab + ">> CONTENEDOR: " + nombre.toUpperCase());
        for (Componente hijo : hijos) {
            hijo.mostrar(out, tab + "    ");
        }
    }

    @Override
    public ProductoCompuesto clone() {
        ProductoCompuesto clon = (ProductoCompuesto) super.clone();
        clon.hijos = new ArrayList<>(); // IMPORTANTE: Nueva lista para el clon
        for (Componente hijo : this.hijos) {
            clon.agregar(hijo.clone()); // Clonación profunda (Prototype)
        }
        return clon;
    }
}