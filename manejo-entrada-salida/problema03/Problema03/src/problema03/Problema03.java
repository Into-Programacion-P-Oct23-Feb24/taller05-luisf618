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
        double costo;
        int minutos;
        double costoTotal;
        System.out.println("Ingrese el costo de del telfono por minuto");
        costo = entrada.nextDouble();
        System.out.println("Ingrese el numero de minutos usados en el mes");
        minutos = entrada.nextInt();
        costoTotal = costo * minutos;
        System.out.printf("El valor de la planilla de telefono es: $%s\n",
                costoTotal);

    }

}
