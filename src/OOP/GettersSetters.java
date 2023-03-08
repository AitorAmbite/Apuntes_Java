package OOP;

public class GettersSetters {
    String nombre;
    int edad;
    int altura;
    // public
    // protected
    // default
    // private

    // static

    /*
    * Los getters son funciones del objeto que nos permiten obtener el valor que tiene x variable del objeto
    * bien sea para imprimirla para hacer operaciones o X
    *
    * Los setters son funciones del objeto que nos permiten asignar un valor a la variable x del objeto
    *
    * Getters sintaxis
    *
    * public tipoVariableRetorno getNombreVariable(){
    *   return nombreVariable a retornar;
    * }
    *
    * Setters sintaxis
    * public void setNombreVariable(tipoVariable nombreVariable){
    *   this.Variable = nombreVariable
    * }
    *
    * */
    public GettersSetters() {
    }
    public GettersSetters(String nombre, int edad, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public GettersSetters(int edad, int altura) {
        this.edad = edad;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
}
