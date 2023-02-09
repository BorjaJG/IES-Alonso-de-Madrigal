package domain.models;

public class Aula {
    private static Integer id;
    private static String planta;
    private Integer capacidad;

    public static Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public static String getPlanta() {
        return planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }

    public Integer getCapacidad(int i) {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }
}
