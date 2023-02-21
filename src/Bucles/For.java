package Bucles;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        /*
        * Estructura
        * for(int variableAcumulador = 0;condicion;suma - resta a variable acumulador){
        *   Acciones a realizar.
        * }
        * */
        /*
        * Sabemos exactamente cuantas veces tenemos que realizar una accion, por ejemplo escribir 10 veces hola
        * como sabemos cuantas veces exactamente tenemos que realizar una accion usamos FOR
        * */

        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
        /*
        * Ejercicio: sabemos que tenemos 10 trozos de pizza, y tenemos 10 personas, queremos repartir 1 trozo a cada persona
        * Sabemos EXACTAMENTE cuantas veces tenemos que repetir la accion de dar un trozo de pizza
        *
        * 1. que variables necesitamos
        * 2. como podemos "repartir" la pizza entre los 10 integrantes (repartir en este caso es restar 1 a la pizza)
        * 3. ¿Por qué o por qué no deberiamos usar for? ¿Podriamos realizar lo mismo con los bucles while y dowhile?
        *   ¿Cual seria mas correcto y porque?
        * */

        Scanner scanner = new Scanner(System.in);
        int escalones = scanner.nextInt();
        for(int x = 0;x <= escalones;x++){

            for(int y = 0;y <= x;y++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        /*
        *
        **
        ***
        ****
        *****
        * */

    }
}