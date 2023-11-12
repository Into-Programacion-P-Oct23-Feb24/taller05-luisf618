/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author mabec
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double costo;
        int kilovatios;
        double valorTotal;
        double descuento;
        int edad;
        System.out.println("Ingrese el valor de kilovatios por hora");
        costo = entrada.nextDouble();
        System.out.println("Ingrese el numero de kilovatios consumidos");
        kilovatios = entrada.nextInt();
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        valorTotal = costo * kilovatios;
        descuento = valorTotal * 0.1;
        if (edad > 65) {
            valorTotal = valorTotal - descuento;
        }
        System.out.printf("El valor total a pagar de la planilla de luz "
                + "es: $%s\n", valorTotal);
    }

}
