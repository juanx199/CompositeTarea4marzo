/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareacomposite.factory.console;
import tareacomposite.factory.Input;
import java.util.Scanner;
/**
 *
 * @author JUANCA
 */
public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);
    public String readData(String prompt){
        System.out.print(prompt + " ");
        return scanner.nextLine();
    }
}
