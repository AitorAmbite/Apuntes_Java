public class BloquesDeControl {
    public static void main(String[] args) {
        /*
         * Los bloques de control son herramientas - estructuras que nosotros tenemos y empleamos para realizar
         * acciones en funcion de unas condiciones.
         *
         * Es decir, pasa esto? haz esto
         * no pasa esto? haz esto
         *
         * Esto se maneja mediante lo que se llama condicionales if else
         * */

        /*
         * Este es el bloque mas basico de los condicionales, bloque if, evalua si una condiciones verdadera o falsa (boolean)
         * si es verdadera, ejecuta lo que hay dentro de sus {}
         * si no salta todo eso y pasa a la siguiente instruccion
         */
        int numTotalPoblacion = 400;
        if (numTotalPoblacion <= 400) {
            System.out.println("todos muertos por culpa de la endogamia fatal");
        }
        /*
         * if{}
         * else{}
         *
         * Este es el siguiente bloque.
         * Su funcion es parecida, si cumple la condicion del if, ejecuto lo que hay dentro, pero si NO la cumple
         * se ejecuta todo lo que este dentro del else{}, una vez acaba de ejecutarse todo lo de dentro del else
         * se ejecuta la siguiente linea de codigo.
         * */
        if (numTotalPoblacion <= 400) {
            System.out.println("todos muertos por culpa de la endogamia fatal");
        } else {
            System.out.println("la humanidad se salva,no seremos todos borbones");
        }
        /*
         * if(){}
         * else if(){}
         * else if(){}
         * else{}
         *
         * Este es el bloque mas "complejo" dentro de los if.
         * Ejecutamos el primer if y miramos si la condicion se cumple, si no, pasamos a lo siguiente
         * Else if, que es un if que se mira la condicion de dentro solo si la anterior condicion es falsa.
         *
         * es decir: if(personas > 400) -> no es cierto pasamos al else if siguiente
         * else if(personas < 400) -> si es verdadera entramos y ejecutamos lo que este dentro de los {}
         * si no pasariamos al siguiente else if en caso de haber
         * y si no al else en caso  de haber.
         * */

        if (numTotalPoblacion > 400) {
            System.out.println("la humanidad se salva,no seremos todos borbones");
        } else if (numTotalPoblacion > 300 && numTotalPoblacion < 400) {
            System.out.println("vamoh viendo si esto rula");
        } else {
            System.out.println("muerteeee");
        }

        boolean esCulpaAsegurado = false;
        int rotura = 400;

        if(esCulpaAsegurado){
            System.out.println("es su culpa se queda sin nada");
        }else if(!esCulpaAsegurado && rotura < 500){
            System.out.println("todo para el");
        }else{

        }
//esCulpaAsegurado == false -> !esCulpaAsegurado;
        /*
         * en las condiciones, podemos tener que evaluar si varias cosas son ciertas o si una cosa es cierta pero la otra no etc
         *
         * Esto se puede conseguir mediante los "operadores logicos" && y ||
         *
         * existen multiples
         * ! -> niega la condicion es decir, condicionTrue = true;
         * !condicionTrue -> esto volveria el boolean false (lo explicare mas en detalle dont worry)
         *
         * && -> operador and, devuelve true si ambas condiciones son ciertas
         * aitor == "buen profe" && andrea == "buena alumna y futura programadora" -> si ambas se cumplen, devuelve true
         * si una de las dos no se cumple, devuelve false, si ambas dos no se cumplen tambien devuelve false.
         *
         * terceraGuerraMundial == "inminente" || terceraGuerraMundial == "ha empezado"
         * Si una de las dos es cierta, devuelve true, si las dos son ciertas, devuelve true, si las dos son falsas devuelve false
         *
         * == igual que
         * != diferente que
         * >= mayor o igual
         * <= menor o igual
         * > mayor que
         * < menor que
         * */

        /*
         * Los if se pueden anidar, es decir tener un if o varios dentro de otro (tambien pueden tener sus respectivos else o else if)
         * */
        int hombres = 1;
        int mujeres = 399;
        if (numTotalPoblacion > 400) {
            if (hombres > mujeres) {
                System.out.println("Me da que esto va acabar mal");
            } else if (hombres < mujeres) {
                System.out.println("esto...tampoco creo que salga mu bien");
            } else {
                System.out.println("a saber que pasa");
            }
        } else {
            System.out.println("todos muertos, que se jodan");
        }

        /*
         * Bloque switch
         * Es el equivalente a un if con else if, pero con una sintaxis mas clara
         * esta muy enfocado a cuando tienes varias o multiples opciones, por simplificar y hacer mas agradable el codigo
         *
         * cada case es un valor que puede tomar esa variable, en caso de que la variable sea es valor, entramos y ejecutamos todo hasta llegar al BREAK;
         * muy importante poner el break siempre al final, es lo que le indica al programa que ha acabado de realizar operaciones
         * default: es una clausula que se ejecuta si la variable no ha cumplido ninguna de las condiciones anteriores.
         * */

        switch (numTotalPoblacion) {
            case 1:
                System.out.println("a la mierda solo 1 persona");
                break;
            case 2:
                System.out.println("a la mierda solo 2 personas");
                break;
            case 3:
                System.out.println("a la mierda solo 3 personas");
                break;
            case 4:
                System.out.println("a la mierda solo 4 personas");
                break;
            default:
                break;
        }

    }
}
