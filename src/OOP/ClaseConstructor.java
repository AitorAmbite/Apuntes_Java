package OOP;

public class ClaseConstructor {
    int num;
    String nombre;
    boolean pruebaBoolean;

    //El constructor como indica el nombre, nos permite crear un objeto

    // IMPORTANTE: puede haber mas de 1 constructor y no pasa nada, es totalmente valido siempre y cuando cumpla unas
    // condiciones

    /*
    * Sintaxsis constructor basico
    *
    * public nombreClase(){}
    *
    * este constructor nos permite crear el objeto sin valores en sus variables, es decir, creamos el objeto "vacio"
    * */
    public ClaseConstructor() {
        // Al usar este constructor , tendriamos el objeto tipo ClaseConstructor, con las variables num,nombre y
        //pruebaBoolean sin valores.
        num = 0;
        nombre = "";
        pruebaBoolean = false;
    }

    /*
    * Sintaxis constructor con parametros
    *
    * En este constructor SI le damos valores - inicializamos las variables de la clase cuando estamos construyendo el
    * objeto, es decir se le asignan valores en su construccion.
    *
    * La sintaxis es la que vemos mas abajo
    * */
    public ClaseConstructor(int num, String nombre, boolean pruebaBoolean) {
        /*
        * Se le añaden parametros que son los que recibira el constructor para asignar a las variables los datos
        * Es buena practica que los parametros se llamen exactamente igual que la variable a la que van a suministrarle
        * el dato
        *
        * PALABRA RESERVADA "this" esta palabra reservada hace referencia a ESTE OBJETO
        * por tanto this.num hace referencia a la variable de este objeto
        * */
        this.num = num;
        this.nombre = nombre;
        this.pruebaBoolean = pruebaBoolean;
    }

    /*
    * Constructor diferentes parametros
    *
    * Puede ser que nos interese crear el objeto con 1 o mas variables con datos, pero no todas las variables
    * por ejemplo solo me interesa la variable num como se ve abajo, pues simplemente usamos la misma sintaxis de
    * los constructores y como parametro ponemos solamente num
    * */
    public ClaseConstructor(int num) {
        this.num = num;
    }

}
