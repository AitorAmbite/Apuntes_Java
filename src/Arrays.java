public class Arrays {
    public static void main(String[] args) {
        //Los arrays son "colecciones" permiten almacenar x cantidad de datos del mismo tipo
        // nos permite acceder a esos valores mediante la posicion en la cual se encuentra el valor.

        int[] arrayBasico = new int[10];
        /*
        * Sintaxis
        *  TipoVariable[] nombreArray = new TipoVariable[tamañoArray]
        *
        * */

        //acceder a un dato

        System.out.println(arrayBasico[0]);
        /*
        * los arrays siempre empiecan por 0, es decir, la primera posicion es el 0
        *
        * la ultima posicion por tanto es: tamaño array - 1
        *
        * si el tamaño es de 10 la ultima posiciones la 9 por tanto tenemos las siguiente posiciones:
        *
        * 0 1 2 3 4 5 6 7 8 9
        *
        * */

        //asignar valor a una posicion

        arrayBasico[0] = 10;
        /*
        * sintaxis
        * NombreArray[posicion que queremos cambiar o asignar el valor] = valor;
        *
        * arrayBasico[0] = 10; -> asignamos a la posicion 0 el valor 10
        * el valor siempre tiene que ser del tipo del array.
        *
        * */

        // Curiosidad, no existe como tal la accion de borrar dentro del array, puedes asignar un valor que tu
        // consideres vacio o null

        // Creacion y asignacion de array

        int[] asignacionArray =  {1,2,3};
        /*
        * Sintaxis:
        * tipoVariable[] nombreArray = {VALORS DEL ARRAY}
        *
        * los valores entre {} tiene que ser del tipo de la variable.
        * la cantidad de valores que tu metas entre {} es ek tanali dek array
        * */


        // funciones sobre arrays.
        // esto obtiene el tamaño del array
        int tamanoArray = asignacionArray.length;

        //falta por completar otros metodos utiles, ya los explicare

    }
}
