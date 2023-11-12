/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author mabec
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double precio;
        int cantidad;
        double valorTotal;
        double descuento;
        System.out.println("Ingrese el precio unitario del articulo");
        precio = entrada.nextDouble();
        System.out.println("Ingresa la cantidad que desea comprar");
        cantidad = entrada.nextInt();
        valorTotal = precio * cantidad;
        descuento = valorTotal * 0.15;
        if (cantidad > 50) {
            valorTotal = valorTotal - descuento;
        }
        System.out.printf("El costo del pedido es: $%s\n", valorTotal);
    }

}
