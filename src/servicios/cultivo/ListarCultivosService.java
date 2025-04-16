package servicios.cultivo;

import modelo.Cultivo;
import java.util.List;

/**
 * Servicio para listar todos los cultivos registrados.
 */
public class ListarCultivosService {

    private final List<Cultivo> cultivos;

    public ListarCultivosService(List<Cultivo> cultivos) {
        this.cultivos = cultivos;
    }

    /**
     * Imprime en consola la lista de cultivos.
     */
    public void ejecutar() {
        if (cultivos.isEmpty()) {
            System.out.println("📭 No hay cultivos registrados.");
            return;
        }

        System.out.println("🌱 Cultivos registrados:");
        for (Cultivo cultivo : cultivos) {
            System.out.println("- " + cultivo);
        }
    }
}
