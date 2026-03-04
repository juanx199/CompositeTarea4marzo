/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareacomposite.builder;
import tareacomposite.model.*;

/**
 *
 * @author JUANCA
 */
public class ProductoBuilder {
    private ProductoCompuesto raiz;

    public ProductoBuilder(String nombrePrincipal) {
        this.raiz = new ProductoCompuesto(nombrePrincipal);
    }

    public ProductoBuilder conPieza(String nombre, double precio) {
        this.raiz.agregar(new ProductoSimple(nombre, precio));
        return this;
    }

    public ProductoBuilder conSubPaquete(ProductoCompuesto sub) {
        this.raiz.agregar(sub);
        return this;
    }

    public ProductoCompuesto build() {
        return this.raiz;
    }
}