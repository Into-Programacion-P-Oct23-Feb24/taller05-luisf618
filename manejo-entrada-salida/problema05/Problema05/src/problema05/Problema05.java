/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author mabec
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double netflix;
        double youtube;
        double dropbox;
        double spotify;
        double valorTotal;
        double descuento;
        int edad;
        System.out.println("Ingrese el valor mensual de netflix");
        netflix = entrada.nextDouble();
        System.out.println("Ingrese el valor mensual de youtube premium");
        youtube = entrada.nextDouble();
        System.out.println("Ingrese el valor mensual de dropbox");
        dropbox = entrada.nextDouble();
        System.out.println("Ingrese el valor mensual de spotify");
        spotify = entrada.nextDouble();
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        valorTotal = netflix + youtube + dropbox + spotify;
        descuento = valorTotal * 0.2;
        if (edad < 30) {
            valorTotal = valorTotal - descuento;
        }
        System.out.printf("El valor total a pagar mensualmente de "
                + "servicios digitales es: $%s\n", valorTotal);
    }

}
