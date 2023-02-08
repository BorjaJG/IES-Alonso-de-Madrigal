package domain.models;

public class Ordenadores extends Aula{
    private Integer numOrdenadores;
    private String tipoOrdenadores;

    public Integer getNumOrdenadores() {
        return numOrdenadores;
    }

    public void setNumOrdenadores(Integer numOrdenadores) {
        this.numOrdenadores = numOrdenadores;
    }

    public String getTipoOrdenadores() {
        return tipoOrdenadores;
    }

    public void setTipoOrdenadores(String tipoOrdenadores) {
        this.tipoOrdenadores = tipoOrdenadores;
    }
}
