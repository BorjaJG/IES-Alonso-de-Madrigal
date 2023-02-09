package domain.models;

public class Ordenadores extends Aula{
    private static Integer numOrdenadores;
    private static String tipoOrdenadores;

    public static Integer getNumOrdenadores() {
        return numOrdenadores;
    }

    public void setNumOrdenadores(Integer numOrdenadores) {
        this.numOrdenadores = numOrdenadores;
    }

    public static String getTipoOrdenadores() {
        return tipoOrdenadores;
    }

    public void setTipoOrdenadores(String tipoOrdenadores) {
        this.tipoOrdenadores = tipoOrdenadores;
    }
}
