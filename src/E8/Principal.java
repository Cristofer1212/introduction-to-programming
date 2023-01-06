package E8;

public class Principal {
    public static void main(String[] args) {
// Vamos a crear el objeto "persona" de la clase "Persona"
        Persona persona = new Persona();
        // Asignando parametros setter (set)
        persona.setEdad(18);
        persona.setNombre("Cristofer");
        persona.setNumPhone(933_289_203);
        // Llamando parametros con getters (get)
        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getNumPhone());
    }

}
class Persona {
    private int edad;
    private String nombre;
    private int numPhone;
// Con los setters vas a crear parametros para las propiedades creadas
    public void setEdad (int edad){
        this.edad = edad;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public void setNumPhone ( int numPhone){
        this.numPhone = numPhone;
    }
// Con los getters vas a llamar a esos parametros creados
    public int getEdad() {
        return this.edad;
    }
    public String getNombre() {
        return this.nombre;
    }
    public int getNumPhone(){
        return this.numPhone;
    }
}
