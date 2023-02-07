// explicar tema de public class su sintaxis + system.out etc.

public class Variables {
    public static void main(String[] args) {
        /*
        * ¿Que es una variable?
        * Una variable es un trozo - porcion de memoria reservada en la que se almacenaran datos.
        * Puede variar la cantidad de memoria reservada en funcion del tipo de variable
        *
        * Las variables tienen tipos, que designan que tipo dato se puede almacenar dentro.
        * Las mas basicas se llaman variables PRIMITIVAS y son las siguientes
        *
        * | Boolean | True o False      | 1 bit
        * | Char    | Caracter          | 16 bits
        * | byte    | entero (signo)    | 8 bits
        * | short   | entero (signo)    | 16 bits
        * | int     | entero (signo)    | 32 bits
        * | long    | entero (signo)    | 64 bits
        * | float   | coma flotante     | 32 bits
        * | double  | coma flotante     | 64 bits
        *
        * */

        /*
        * Las variables las usamos para almacenar datos en nuestro codigo y realizar operaciones con esos valores
        * o sobre esos valores.
        * Para poder usar variables tenemos que declararlas (e inicializarlas - opcional) de la siguiente manera
        *
        * las variables son case sensitive, se tienen que usar con el nombre tal y como esta escrito teniendo en cuenta
        * mayusculas y minusculas
        * */

     // | tipo | Nombre de la variable | valor inicial |
        boolean nombreVariableBoolean = false;
        /*
        * Las variables siempre tienen que especificar el tipo de valor que almacenan, boolean
        * int etc, y NO puede cambiar ese tipo NI PUEDE almacenar otro tipo de valor que no sea saea el especificado
        *
        * Ejemplo:
        * */

        // aqui almacenamos tipos boolean
        boolean ejemploVariable = false;
        //ejemploVariable = 1; // esto da fallo porque estamos intentando almacenar un dato que no es del tipo correcto

        /*
        * Para darle un nuevo valor o cambiarlo es tan siemple como hacer lo que se conoce como
        * ASIGNACION , es darle un nuevo valor a la variable.
        *
        * EJEMPLO:
        * */


        boolean ejemploBoolean = true;
        ejemploBoolean = false; //aqui le cambiamos el valor - asignamos un nuevo valor.


        /*
        * EJEMPLOS VARIOS
        * */

        char ejemploCaracer = 'c'; // los tipo char tienen la peculiaridad de que tienen que ir entre comillas simples ''
        ejemploCaracer = 'b'; // y solo pyueden almacenar un unico caracter.

        String ejemploString = "hola mundo";
        ejemploString = "adios mundo";

    }
}
