package domain.models;

public class Profesor {
    public static String getId;
    private static Integer id;
    private static String nombre;
    private static String apellidos;
    private static String dni;
    private static String direccion;
    private String tituloAcdemico;
    private String fechaAlta;

    public static Integer getId(int i) {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public static String getNombre(String maria) {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public static String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public static String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTituloAcdemico(String profesor) {
        return tituloAcdemico;
    }

    public void setTituloAcdemico(String tituloAcdemico) {
        this.tituloAcdemico = tituloAcdemico;
    }

    public String getFechaAlta(int i) {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }


}
