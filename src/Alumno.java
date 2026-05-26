public class Alumno {
    //Atributos
    private String nombre;
    private int grado;

    //Constructor

    public Alumno(String nombre, int grado) {
        this.nombre = nombre;
        this.grado = grado;
    }


    //Métodos


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }


    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", grado=" + grado +
                '}';
    }
}
