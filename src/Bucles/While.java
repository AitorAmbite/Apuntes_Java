package Bucles;

public class While {
    /*
    * Estructura
    * While(condicion){
    *   Instrucciones a ejecutar
    * }
    * */

    public static void main(String[] args) {
        // Queremos batir los huevos un numero par de veces, pero que sea mas de 2 veces al menos.
        /*
        * Mini ejercicio de pensah:
        * 1. Di si esto es correcto o no.
        * 2. Explicame porque es o no correcto
        * 3. Explicame la ejecucion del programa, es decir que hace el programa
        * 4. si cambiasemos NumVecesBatidosHuevos = 4; que pasaria?
        *
        * */
        int NumVecesBatidosHuevos = 0;
        boolean huevosBatidos = false;

        while(NumVecesBatidosHuevos <= 2 || NumVecesBatidosHuevos % 2 != 0){
            NumVecesBatidosHuevos++;
            System.out.println("hemos batido los huevos "+NumVecesBatidosHuevos);
        }
    }


}
