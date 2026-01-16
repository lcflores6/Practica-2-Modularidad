package gestioncurso;
import java.util.*;
/* PRINCIPIO APLICADO:
- SRP (Responsabilidad Única): Solo registra al estudiante y sus notas.
   PASO DE PARÁMETROS:
- Método public Estudiante(String nombre, double[] notas):
    double[]  notas -> paso por referencia.
    String nombre -> paso por valor. 
*/
public class Estudiante {
    private String nombre;
    private double[] notas;

    public Estudiante(String nombre, double[] notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public double[] getNotas() {
        return notas;
    }
    
    public void registrarEstudiante(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre del estudiante: ");
        nombre = sc.nextLine();

        System.out.print("Cuantas notas desea registrar? ");
        int n = sc.nextInt();
        sc.nextLine();
        
        notas = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }
    }
}
