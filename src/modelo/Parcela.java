package modelo;

import java.util.ArrayList;
import java.util.List;

public class Parcela {
    private String codigo;
    private double tamano;
    private String ubicacion;
    private final List<Cultivo> cultivos;

    public Parcela(String codigo, double tamano, String ubicacion) {
        this.codigo = codigo;
        this.tamano = tamano;
        this.ubicacion = ubicacion;
        this.cultivos = new ArrayList<>();
    }

    public String getCodigo() { return codigo; }
    public double getTamano() { return tamano; }
    public void setTamano(double tamano) { this.tamano = tamano; }
    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }
    public List<Cultivo> getCultivos() { return cultivos; }

    @Override
    public String toString() {
        return "Parcela: " + codigo + " - Tamaño: " + tamano + "ha - Ubicación: " + ubicacion + ", Cultivos: " + cultivos.size();
    }
}
