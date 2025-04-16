package modelo;

import java.time.LocalDate;

public class Actividad {
    private final String tipo;
    private final LocalDate fecha;
    private boolean completada;

    public Actividad(String tipo, LocalDate fecha) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.completada = false;
    }

    public String getTipo() { return tipo; }
    public LocalDate getFecha() { return fecha; }
    public boolean isCompletada() { return completada; }
    public void setCompletada(boolean completada) { this.completada = completada; }

    @Override
    public String toString() {
        return tipo + " - " + fecha + (completada ? " (completada)" : "");
    }
}
