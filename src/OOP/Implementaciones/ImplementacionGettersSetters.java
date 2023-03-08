package OOP.Implementaciones;

import OOP.GettersSetters;

public class ImplementacionGettersSetters {
    public static void main(String[] args) {

        GettersSetters gettersSetters = new GettersSetters("Aitor",22,178);

        /*
        * Los setters nos permiten cambiar los datos de las variables de un objeto
        * */
        gettersSetters.setAltura(177); // para usar un setter del objeto seria nombreVariableObjeto.Setter(valor);

        System.out.println(gettersSetters.getNombre()); // para usar un setter del objeto seria nombreVariableObjeto.getter();

    }
}
