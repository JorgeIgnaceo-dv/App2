package services.cultivo;

import models.Cultivo;
import java.util.Iterator;
import java.util.List;

/**
 * Servicio para eliminar un cultivo por nombre, si no tiene restricciones.
 */
public class EliminarCultivoService {

    private final List<Cultivo> cultivos;

    public EliminarCultivoService(List<Cultivo> cultivos) {
        this.cultivos = cultivos;
    }

    /**
     * Elimina un cultivo por nombre (ignorando mayúsculas/minúsculas).
     *
     * @param nombre nombre del cultivo a eliminar
     */
    public void ejecutar(String nombre) {
        Iterator<Cultivo> iterator = cultivos.iterator();
        boolean eliminado = false;

        while (iterator.hasNext()) {
            Cultivo cultivo = iterator.next();
            if (cultivo.getNombre().equalsIgnoreCase(nombre)) {
                iterator.remove();
                eliminado = true;
                System.out.println("✅ Cultivo eliminado: " + nombre);
                break;
            }
        }

        if (!eliminado) {
            System.out.println("❌ No se encontró un cultivo con el nombre: " + nombre);
        }
    }
}