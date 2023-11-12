/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author mabec
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double computadora;
        double teclado;
        double mouse;
        double pantalla;
        double valorTotal;
        System.out.println("Ingrese el valor del CPU");
        computadora = entrada.nextDouble();
        System.out.println("Ingrese el valor del teclado");
        teclado = entrada.nextDouble();
        System.out.println("Ingrese el valor de la pantalla");
        pantalla = entrada.nextDouble();
        System.out.println("Ingrese el valor del raton");
        mouse = entrada.nextDouble();
        valorTotal = computadora + teclado + pantalla + mouse;
        System.out.printf("El valor total de la computadora es: $%s",
                valorTotal);
    }

}
