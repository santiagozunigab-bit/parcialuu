public class Estudiante extends Persona {
    private String matricula;
    private String carrera;

    // Constructor por defecto
    public Estudiante() {
        super();
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCarrera() {
        return this.carrera;
    }
}