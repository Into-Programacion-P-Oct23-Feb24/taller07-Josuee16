/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author VEL-USER
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre;
        String posicion;
        int edad;
        String tabla = "Listado de jugadores \n";
        double altura;
        String edades = "Listado de edades\n";
        double promedioedades = 0;
        double promedioalturas = 0;
        int contador = 1;
        int limite;
        System.out.println("Ingrese la cantidad de jugadores que desea registrar");
        limite = entrada.nextInt();
        do {
            entrada.nextLine();
            System.out.println("Ingrese el nombre del jugador");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la posicion del jugador");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del jugador");
            altura = entrada.nextDouble();
            tabla = String.format("%s %s -%s-",tabla
            ,nombre,posicion,edad,altura);
            edades = String.format("%s%d\n",edades,edad);
            promedioedades = (promedioedades + edad)/contador;
            promedioalturas = (promedioalturas + altura) / contador;
            contador = contador + 1;
                 
        } while (contador <= limite);
         System.out.printf("%s%sPromedio de edades: %.2f\nPromedio de estaturas"
                + " %.2f\n",tabla,edades,promedioedades,promedioalturas);  
    }
}
