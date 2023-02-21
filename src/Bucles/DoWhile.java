package Bucles;

import java.util.Random;

public class DoWhile {
    public static void main(String[] args) {
        //Estructura
        /*
        * do{
        *   Acciones - algoritmos etc
        * }while(condicion)
        * */

        /* Sabemos que tenemos que hace algo al menos 1 vez si o si pero mas alla de la primera vez,
         * no sabemos si tenemos que hacerla 4 - 5 o n veces pero si al menos 1 vez
         *
         * Ejemplo: sabemos que no tenemos ninguna patata para hacer una tortilla, y sabemos que tenemos que comprar
         * AL MENOS 1 patata, pero, el numero de patatas no lo tenemos claro realmente
         */
        int numPatatas = 0;
        int numPatatasRequeridas = new Random().nextInt(10 - 3 + 1) + 3; // 7
        do{
            numPatatas += 1;
        }while(numPatatas < numPatatasRequeridas);

        System.out.println(numPatatas);
        System.out.println(numPatatasRequeridas);
        /*
        * Ejercicio: tenemos que pedirle al usuarioun numero comprendido entre el 10 y el 100, si introduce un numero que no sea
        * correcto debemos pedir otra vez un numero al usuario
        *
        * 1. ¿Que variables necesitamos para realizar el ejercicio?
        * 2. ¿por qué o por qué no es correcto usar dowhile?
        * 3. ¿Podrias hacerlo con While? ¿Y con for?
        * */


    }
}
