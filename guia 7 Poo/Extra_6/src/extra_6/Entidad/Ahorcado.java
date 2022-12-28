package extra_6.Entidad;

public class Ahorcado {
    private String[] palabra;
    private int letras;
    private int jugadas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabraABuscar, int letras, int jugadas) {
        this.palabra = palabra;
        this.letras = letras;
        this.jugadas = jugadas;
    }

    public String[] getPalabraABuscar() {
        return palabra;
    }

    public void setPalabraABuscar(String[] palabra) { 
        this.palabra = palabra;
    }

    public int getLetras() {
        return letras;
    }

    public void setLetras(int letras) {
        this.letras = letras;
    }

    public int getJugadas() {
        return jugadas;
    }

    public void setJugadas(int jugadas) {
        this.jugadas = jugadas;
    }
    
    
    
}
