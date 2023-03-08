package OOP.Implementaciones;

import OOP.ClaseConstructor;

public class ConstructorImplementacion {

    public static void main(String[] args) {

        /*
        * Vamos a ver como hacer uso de los constructores y como crear objetos
        *
        * En esencia crear un objeto es crear una "variable compleja" que tiene funciones, y variables
        *
        * para usar un constructor y crear la clase tenemos que usar la siguiente sintaxis
        *
        * TipoClase nombreVariable = new TipoClase(parametros_si_hacen_falta);
        *
        * la palabra new se puede entender como lo que nos permite crear el objeto haciendo uso del constructor.
        * */

        ClaseConstructor objeto1 = new ClaseConstructor(); // Instanciamos un objeto sin asignarle valores

        // Aquí creamos otro objeto nuevo, pero esta vez si pasandole parametros para que asigne esos valores a
        // las variables del objeto
        ClaseConstructor objetoParametros = new ClaseConstructor(1,"test",false);

        // usamos el tercer constructor para cosntruir un objeto asignandole un valor solamente a 1 de las variables
        // en este casoa  num
        ClaseConstructor objeto1Parametro = new ClaseConstructor(1);


    }
}
