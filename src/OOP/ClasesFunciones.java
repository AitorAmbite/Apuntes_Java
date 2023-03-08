package OOP;

import java.util.Random;

public class ClasesFunciones {
    int totalDinero;
    int totalDeuda;
    boolean estaSobreendeudado;

    Random test;

    public ClasesFunciones(int totalDinero) {
        this.totalDinero = totalDinero;
        this.totalDeuda = 0;
        estaSobreendeudado = false;
    }
    public ClasesFunciones(int totalDinero,int totalDeuda,Random test) {
        this.totalDinero = totalDinero;
        this.totalDeuda = totalDeuda;
        this.test = test;
        recalcularDeuda();
    }

    private boolean recalcularDeuda(){
        int totalDespuesDeuda = this.totalDinero -  this.totalDeuda;
        if( totalDespuesDeuda < 0){
            this.estaSobreendeudado = true;
            return true;
        }
        this.estaSobreendeudado = false;
        return false;
    }

    public boolean retirarDinero(int totalRetirada){
        if(recalcularDeuda()){
            return false;
        }
        if(totalRetirada > totalDinero){
            totalDinero = 0;
            totalDeuda += Math.abs(this.totalDinero - totalRetirada);
            recalcularDeuda();
            return true;
        }
        totalDinero -= totalRetirada;
        return true;
    }

}
