package servicios.actividad;

import modelo.Actividad;
import modelo.Cultivo;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

/**
 * Servicio para registrar una nueva actividad a un cultivo.
 */
public class RegistrarActividadService {

    private final List<Cultivo> cultivos;
    private final Scanner scanner;

    public RegistrarActividadService(List<Cultivo> cultivos, Scanner scanner) {
        this.cultivos = cultivos;
        this.scanner = scanner;
    }

    /**
     * Ejecuta el proceso de registrar una actividad para un cultivo específico.
     */
    public void ejecutar() {
        System.out.print("🔎 Nombre del cultivo al que se le asignará una actividad: ");
        String nombreCultivo = scanner.nextLine();

        Cultivo cultivo = buscarCultivo(nombreCultivo);

        if (cultivo == null) {
            System.out.println("❌ No se encontró el cultivo.");
            return;
        }

        System.out.print("📌 Tipo de actividad (ej. RIEGO, COSECHA): ");
        String tipo = scanner.nextLine();

        System.out.print("📅 Fecha de la actividad (AAAA-MM-DD): ");
        String fechaStr = scanner.nextLine();

        try {
            LocalDate fecha = LocalDate.parse(fechaStr);
            Actividad actividad = new Actividad(tipo, fecha);
            cultivo.getActividades().add(actividad);
            System.out.println("✅ Actividad registrada exitosamente.");
        } catch (Exception e) {
            System.out.println("❌ Fecha inválida. Asegúrate de usar el formato AAAA-MM-DD.");
        }
    }

    private Cultivo buscarCultivo(String nombre) {
        for (Cultivo cultivo : cultivos) {
            if (cultivo.getNombre().equalsIgnoreCase(nombre)) {
                return cultivo;
            }
        }
        return null;
    }
}