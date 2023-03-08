package Ejercicios;

public class Eje1Clase {
    public static void main(String[] args) {
        /*
         * tengo n arrays cada uno con un tamaño de x
         *
         * Quiero una funcion que imprima todos los datos de un array
         * por cada vez que llame a la funcion se imprime un array nada mas
         *
         * */

        int[] array1 = new int[]{0,1,2,3,4};
        int[] array2 = new int[]{5,6,7,8,9};
        imprimirArray(array1);
        imprimirArray(array2);

    }
    public static void imprimirArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
