public class Persona {
    private String nombre, apellido;


    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }


    @Override
    public String toString() {
        return
                "Nombre Completo: " + nombre +
                        " " + apellido;
    }



}
