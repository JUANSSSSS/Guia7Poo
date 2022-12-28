package extra_5.Entidad;

public class Meses {

    private final String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septienmbre", "octibre", "noviembre", "diciembre"};
    ;
    private final String mesSecreto;

    public Meses() {
        this.mesSecreto = meses[(int) (Math.random() * 12)];
    }

    public String[] getMeses() {
        return meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

}
