public class Docente extends Persona {
    private String materia;

    // Constructor por defecto
    public Docente() {
        super();
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getMateria() {
        return this.materia;
    }
}