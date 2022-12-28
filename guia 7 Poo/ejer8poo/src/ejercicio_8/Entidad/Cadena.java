package ejercicio_8.Entidad;

public class Cadena {
    private String frase;
    private int len;

    public Cadena() {
    }

    public Cadena(String frase, int len) {
        this.frase = frase;
        this.len = len;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }
    
    
    
}
