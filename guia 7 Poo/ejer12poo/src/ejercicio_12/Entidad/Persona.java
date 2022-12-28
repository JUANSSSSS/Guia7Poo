package ejercicio_12.Entidad;

import java.util.Date;

public class Persona {
    public Date fecha;
    public String nombre;

    public Persona() {
    }

    public Persona(Date fecha, String nombre) {
        this.fecha = fecha;
        this.nombre = nombre;
    }
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
