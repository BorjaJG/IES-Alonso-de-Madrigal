package domain.models;

public class Curso {
    private Integer id;
    private String nombre;
    private String descripcion;

    public Integer getId(int i) {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre(String s) {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion(String desde_septiembre_a_julio) {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }



}
