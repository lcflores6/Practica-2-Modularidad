package sistemacalificaciones;
/* PRINCIPIOS APLICADOS:
- SRP (Responsabilidad Única): Solo muestra la información.
   PASO DE PARÁMETROS:
- Método public void mostrar(String nombre, double promedioOriginal, double promedioPenalizado):
    String nombre -> paso por valor
    double promedioOriginal -> paso por valor
    double promedioPenalizado -> paso por valor
*/
public class Reporte {
    
    public void mostrar(String nombre, double promedioOriginal, double promedioPenalizado) {
        System.out.println("=== REPORTE FINAL ===");
        System.out.println("Estudiante: " + nombre);
        System.out.println("Promedio original: " + promedioOriginal);
        System.out.println("Promedio penalizado: " + promedioPenalizado);
        System.out.println("Estado: " + (promedioPenalizado >= 14 ? "APROBADO" : "REPROBADO"));
    }
}
