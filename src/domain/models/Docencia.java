package domain.models;

public class Docencia extends Aula{
    private static Integer sillas;
    private static String tipoPizarra;



    public static Integer getSillas() {
        return sillas;
    }

    public void setSillas(Integer sillas) {
        this.sillas = sillas;
    }

    public static String getTipoPizarra() {
        return tipoPizarra;
    }

    public void setTipoPizarra(String tipoPizarra) {
        this.tipoPizarra = tipoPizarra;
    }
}
