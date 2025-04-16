package services.cultivo;

import models.Cultivo;
import java.util.List;

/**
 * Servicio para buscar un cultivo por nombre exacto (sin distinción de mayúsculas).
 */
public class BuscarCultivoService {

    private final List<Cultivo> cultivos;

    public BuscarCultivoService(List<Cultivo> cultivos) {
        this.cultivos = cultivos;
    }

    /**
     * Busca un cultivo por nombre exacto (ignora mayúsculas/minúsculas).
     *
     * @param nombre nombre a buscar
     * @return el cultivo encontrado, o null si no existe
     */
    public Cultivo ejecutar(String nombre) {
        for (Cultivo cultivo : cultivos) {
            if (cultivo.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("🔍 Cultivo encontrado: " + cultivo);
                return cultivo;
            }
        }
        System.out.println("❌ Cultivo no encontrado: " + nombre);
        return null;
    }
}
