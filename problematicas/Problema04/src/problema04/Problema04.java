/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 *
 * @author VEL-USER
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int lim = 15;
        int num = 1;
        int contador = 0;
        int dem = 3;
        double frac;
        double total = 1;
        String signo;
        String resultado ="";
      
        while (dem <= lim) {
            if (contador ==0){
                signo = "-";
                frac =(-((double)num / dem));
                contador = contador + 1;
            } else {
                signo = "+";
                contador = contador -1;
                frac = (+((double)num / dem));
            }
            resultado = String.format("%s%s %d/%d", resultado
                    ,signo,num,dem);
            total = total + frac;
            dem = dem + 2;

            
         

        }
        System.out.printf("%d %s",contador ,resultado);
        System.out.printf("\nEl total es: %.2f",total);

    }

}
