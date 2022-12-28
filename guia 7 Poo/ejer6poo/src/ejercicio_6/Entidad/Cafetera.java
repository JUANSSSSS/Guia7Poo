package ejercicio_6.Entidad;

public class Cafetera {
    private final int capacidadMaxima = 420;
    private int cantidadActual;

    public Cafetera() {
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadAtual) {
        this.cantidadActual = cantidadAtual;
    }
    
    
    
}
