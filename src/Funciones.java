import java.util.Random;

public class Funciones {
    /*
    * Funciones, son porciones de codigo, las cuales realizan operaciones (como dijo rajoy..."hacen cosas")
    * cuando las invocas o llamas.
    *
    * Nos permiten estructurar el codigo, dividir el codigo en partes mas pequeñas y manejables.
    * vamos a ver de lo mas basico a lo mas "complicado"
    *
    *
    * ------ Sintaxis ------
    * modificadorVisibilidad TipoDeVariableDeRetorno NombreFuncion(tipoParametroVariable nombreParametro,...){
    *   codigo a ejecutar
    *   return valor que devolvemos, tiene que ser del mismo tipo que "TipoDeVariableDeRetorno";
    * }
    *
    * EJEMPLO:
    * */

    public static int suma(int pepe,int b){
        return pepe+b;
    }
    int l = suma(1,3);
    public static int GenerarAleatorio(){
        Random generador = new Random();
        return generador.nextInt();
    }


    /*
    * Aqui hemos definido una funcion
    * con "modificadorVisibilidad" -> public
    * con  "TipoDeVariableDeRetorno" -> int
    * con   "NombreFuncion" -> suma
    *
    * Explicaciones:
    * ModificadorVisibilidad -> de momento pasamos de esto, te lo explico mas adelante en poo
    *
    * TipoDeVariableDeRetorno -> esto define que tipo de dato debe devolver la funcion, es decir, el tipo de dato del return
    * tu siempre vas a devolver el mismo dato que "TipoDeVariableDeRetorno" si es int, devolveras un int, si es un string haras return de un string
    *
    * NombreFuncion -> el nombre que le das a la funcion para llamarla en cualquier punto de tu programa
    *
    * tipoParametroVariable -> el tipo de valor - variable que se le tiene que pasar a la funcion.
    *
    * nombreParametro -> el nombre con el que se va a hacer referencia a ese valor que te han pasado como parametro.
    *
    * "return" -> es lo que llamamos palabra reservada (te lo explicare de viva voz), lo que hace es decirle al programa
    * que es el final de la funcion (no tiene porque haber 1 solo ni estar justamente al final, pondre ejemplos).
    * Y lo que hace es devolver el valor que tu pongas justo detras o de la variable que tu pongas justo detras
    *
    *
    * Es decir en esta funcion, lo que se devuelve es la suma de a y b (tambien se puede devolver operaciones, sumas restas etc,
    *                                                                   siempre que el valor que da esa operacion sea del mismo
    *                                                                   tipo que TipoDeVariableDeRetorno)
    *
    * Ejemplos
    * */

    public boolean haceFrio(String respuesta){
        if(respuesta == "si"){
            return true;
        }else{
            return false;
        }
    }


    public void funcionSinValorDeRetorno(String message){
        System.out.println(message);
    }





}
