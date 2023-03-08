package OOP.Implementaciones;

import OOP.ClasesFunciones;

import java.util.Random;

public class ImplementacionFunciones {
    public static void main(String[] args) {
        ClasesFunciones cuentaPersona1 = new ClasesFunciones(1000);
        ClasesFunciones cuentaPersona2 = new ClasesFunciones(1000,300,new Random());

        cuentaPersona2.retirarDinero(3000);

    }
}
