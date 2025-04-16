package servicios.cultivo;

import modelo.Cultivo;
import java.util.List;

/**
 * Servicio para editar el nombre de un cultivo existente.
 */
public class EditarCultivoService {

    private final List<Cultivo> cultivos;

    public EditarCultivoService(List<Cultivo> cultivos) {
        this.cultivos = cultivos;
    }

    /**
     * Busca un cultivo por nombre actual y le cambia el nombre.
     *
     * @param nombreActual Nombre actual del cultivo
     * @param nuevoNombre  Nuevo nombre que se desea asignar
     */
    public void ejecutar(String nombreActual, String nuevoNombre) {
        for (Cultivo cultivo : cultivos) {
            if (cultivo.getNombre().equalsIgnoreCase(nombreActual)) {
                cultivo.setNombre(nuevoNombre);
                System.out.println("✏️ Cultivo actualizado: " + cultivo);
                return;
            }
        }
        System.out.println("❌ Cultivo no encontrado: " + nombreActual);
    }
}
