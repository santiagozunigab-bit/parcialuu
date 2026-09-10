public class Persona {
    private String nombre;
    private int edad;

    // Constructor por defecto
    public Persona() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    // Si se respeta el parámetro String del diagrama:
    public void setEdad(String edad) {
        this.edad = Integer.parseInt(edad);
    }

    public int getEdad() {
        return this.edad;
    }
}
