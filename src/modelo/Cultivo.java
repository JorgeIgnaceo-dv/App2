package src.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cultivo {
    private String nombre;
    private String variedad;
    private LocalDate fechaSiembra;
    private String estado;
    private final List<Actividad> actividades;

    public Cultivo(String nombre) {
        this.nombre = nombre;
        this.variedad = "";
        this.fechaSiembra = LocalDate.now();
        this.estado = "ACTIVO";
        this.actividades = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getVariedad() { return variedad; }
    public void setVariedad(String variedad) { this.variedad = variedad; }
    public LocalDate getFechaSiembra() { return fechaSiembra; }
    public void setFechaSiembra(LocalDate fechaSiembra) { this.fechaSiembra = fechaSiembra; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public List<Actividad> getActividades() { return actividades; }

    @Override
    public String toString() {
        return nombre + " - " + variedad + " - " + fechaSiembra + " - " + estado;
    }
}
