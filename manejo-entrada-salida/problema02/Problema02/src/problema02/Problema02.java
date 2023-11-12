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
        double gasto1;
        double gasto2;
        double gasto3;
        double gastoTotal;
        System.out.println("Ingrese los gastos del primer hijo");
        gasto1 = entrada.nextDouble();
        System.out.println("Ingrese los gastos del segundo hijo");
        gasto2 = entrada.nextDouble();
        System.out.println("Ingrese los gastos del tercer hijo");
        gasto3 = entrada.nextDouble();
        gastoTotal = gasto1 + gasto2 + gasto3;
        System.out.printf("El total de gastos de los hijos es: $%s",
                gastoTotal);
    }

}
