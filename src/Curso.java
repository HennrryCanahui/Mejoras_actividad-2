public class Curso {
    private String nombre;
    private String codigo;

    public Curso(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Nombre del Curso: " + nombre + "\nCódigo del Curso: " + codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }
}
