/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareacomposite;

import tareacomposite.factory.IOFactory;
import tareacomposite.factory.frame.FrameIOFactory;
import tareacomposite.factory.console.ConsoleIOFactory;
import tareacomposite.factory.Output;
import tareacomposite.builder.ProductoBuilder;
import tareacomposite.model.ProductoCompuesto;
import tareacomposite.model.ProductoSimple;

/**
 *
 * @author JUANCA
 */
public class TareaComposite {
    public static void main(String[] args) {
        // Interfaz por consola por defecto para el menú inicial
        IOFactory initialMenuFactory = new ConsoleIOFactory();
        Output menuOut = initialMenuFactory.createOutput();
        tareacomposite.factory.Input menuIn = initialMenuFactory.createInput();

        menuOut.writeData("Seleccione el entorno de ejecución:\n1. Consola\n2. Ventana (Frame)\n");
        String opcion = menuIn.readData("Ingrese una opción (1 o 2):");

        IOFactory factory;
        switch (opcion) {
            case "2":
                menuOut.writeData("Cargando entorno visual (Frame)...");
                factory = new FrameIOFactory();
                break;
            case "1":
            default:
                menuOut.writeData("Cargando entorno de consola...");
                factory = new ConsoleIOFactory();
                break;
        }

        Output out = factory.createOutput();

        // Usar BUILDER para crear el COMPOSITE
        ProductoBuilder builder = new ProductoBuilder("PC Gamer Alpha");
        builder.conPieza("RTX 4090", 1600.0)
                .conPieza("Ryzen 9", 450.0)
                .conPieza("32GB RAM DDR5", 180.0);

        ProductoCompuesto pcOriginal = builder.build();

        // Usar PROTOTYPE para clonar y modificar
        ProductoCompuesto pcClonada = pcOriginal.clone();
        pcClonada.agregar(new ProductoSimple("Disco SSD 2TB", 120.0));

        out.writeData("=== CONFIGURACIÓN ORIGINAL ===");
        pcOriginal.mostrar(out, "");

        out.writeData("\n=== CONFIGURACIÓN CLONADA (Con extra) ===");
        pcClonada.mostrar(out, "");
    }
}