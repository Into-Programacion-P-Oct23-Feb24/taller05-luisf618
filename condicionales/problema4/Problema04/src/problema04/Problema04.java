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
        int dias;
        double precioDiario;
        double descuento;
        double subtotal;
        double totalPagar;
        System.out.println("Ingrese el numero de dias que se va a hospedar");
        dias = entrada.nextInt();
        System.out.println("Ingrese el precio diario por habitacion");
        precioDiario = entrada.nextDouble();
        subtotal = precioDiario * dias;
        if (dias > 5 && dias <= 10) {
            descuento = subtotal * 0.1;
        } else {
            if (dias > 10 && dias <= 15) {
                descuento = subtotal * 0.15;
            } else {
                if (dias > 15) {
                    descuento = subtotal * 0.2;
                } else {
                    descuento = 0;
                }
            }
        }
        totalPagar = subtotal - descuento;
        System.out.printf("El subtotal a pagar es: $%s\nEl descuento es: "
                + "$%s\nEl total a pagar es: $%s\n",subtotal,descuento,
                totalPagar);
    }

}
