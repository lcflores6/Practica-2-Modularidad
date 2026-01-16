package gestioncurso;
/* PRINCIPIO APLICADO:
- SRP (Responsabilidad Única): Solo presenta los resultados finales.
   PASO DE PARÁMETROS:
- Método public void mostrar(String nombre, double[] notas, double promedio): 
    String nombre -> paso por valor.
    double[] notas -> paso por referencia.
    double promedio -> paso por valor.
*/
public class Reporte {
    public void mostrar(String nombre, double[] notas, double promedio) {
        System.out.println("=== REPORTE DEL CURSO ===");
        System.out.println("Estudiante: " + nombre);

        System.out.print("Notas finales: ");
        for (double n : notas) {
            System.out.print(n + " ");
        }

        System.out.println("\nPromedio final: " + promedio);
    }
}
