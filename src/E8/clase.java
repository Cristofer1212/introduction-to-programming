package E8;

public class clase {
    public static void main(String[] args) {
        Vehiculo coche = new Vehiculo(); // Esto es una instancia (objeto)
        coche.setTipo("Coche");

        Vehiculo moto = new Vehiculo(); // Esto es una instancia (Objeto)
        moto.setTipo("La Dukati");

        System.out.println(coche.getTipo());
        System.out.println(moto.getTipo());

    }

}
class Vehiculo {
    private String tipo; // Esto es una propiedad

    public  void setTipo(String tipo) {
        this.tipo = tipo; //es una funcion setter ya que recibe un parametro y no devuelve nada
    }
// en la clase vehiculo "this" hace referencia a la propiedad "tipo" creada
// y se le asigana el valor del parametro "tipo"
    public String getTipo(){
        return this.tipo; //devuelve la propiedad "tipo" de la clase Vehiculo
    }
}
