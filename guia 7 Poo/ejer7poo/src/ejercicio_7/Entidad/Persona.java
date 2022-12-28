package ejercicio_7.Entidad;

public class Persona {
    private String nombre;
    private String sexo;
    private double altura;
    private int edad;
    private int peso;

    public Persona() {
    }

    public Persona(String nombre, String sexo, int altura, int edad, int peso) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.altura = altura;
        this.edad = edad;
        this.peso = peso;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    
    
}
