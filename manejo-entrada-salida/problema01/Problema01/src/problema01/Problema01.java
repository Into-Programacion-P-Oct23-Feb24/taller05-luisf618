/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author lcord
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double base;
        double altura;
        double area;
        System.out.println("Ingrese el valor de la base");
        base = entrada.nextDouble();
        System.out.println("Ingrese el valor de la altura");
        altura = entrada.nextDouble();
        area = (base * altura) / 2;
        System.out.printf("El valor del area del triangulo es: %s",
                area);
    }

}
