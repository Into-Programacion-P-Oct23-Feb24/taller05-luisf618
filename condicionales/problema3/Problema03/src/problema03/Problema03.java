/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author mabec
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String marca;
        String origen;
        double costo;
        double impuesto;
        double valorTotal;
        System.out.println("Ingrese la marca del automovil");
        marca = entrada.nextLine();
        System.out.println("Ingrese el origen del automovil");
        origen = entrada.nextLine();
        System.out.println("Ingrese el costo del automovil");
        costo = entrada.nextDouble();
        if (origen.equals("Alemania")) {
            impuesto = costo * 0.2;
        } else {
            if (origen.equals("Japon")) {
                impuesto = costo * 0.3;
            } else {
                if (origen.equals("Italia")) {
                    impuesto = costo * 0.15;
                } else {
                    if (origen.equals("USA")) {
                        impuesto = costo * 0.08;
                    } else {
                        impuesto = 0;
                    }
                }

            }

        }
        valorTotal = costo + impuesto;
        System.out.printf("El automovil de marca %s con origen de %s "
                + "tiene un impuesto de $%s y un total a pagar de $%s\n",
                marca, origen, impuesto, valorTotal);
    }
}
