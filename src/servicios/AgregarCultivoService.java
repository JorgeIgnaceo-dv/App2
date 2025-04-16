package services.cultivo;

import models.Cultivo;
import java.util.List;

/**
 * Servicio para agregar un cultivo a la lista existente.
 */
public class AgregarCultivoService {

    private final List<Cultivo> cultivos;

    public AgregarCultivoService(List<Cultivo> cultivos) {
        this.cultivos = cultivos;
    }

    /**
     * Agrega un cultivo si no existe previamente.
     *
     * @param cultivo El cultivo a agregar
     */
    public void ejecutar(Cultivo cultivo) {
        if (!cultivos.contains(cultivo)) {
            cultivos.add(cultivo);
            System.out.println("✅ Cultivo agregado: " + cultivo);
        } else {
            System.out.println("⚠️ El cultivo ya existe.");
        }
    }
}
