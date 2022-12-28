package ejercicio_5.Entidades;

public class Cuenta {
    private int numeroC;
    private long DNI;
    private int saldo;

    public Cuenta() {
    }

    public Cuenta(int numeroC, long DNI, int saldo) {
        this.numeroC = numeroC;
        this.DNI = DNI;
        this.saldo = saldo;
    }

    public int getNumeroC() {
        return numeroC;
    }

    public void setNumeroC(int numeroC) {
        this.numeroC = numeroC;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    
}
