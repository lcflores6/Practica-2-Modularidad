package sistemacalificaciones;
import java.util.*;
/* PRINCIPIO APLICADO:
- SRP (Responsabilidad Única): Solo registra al estudiante y sus notas.
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

        System.out.print("Cuantas notas parciales desea registrar? ");
        int n = sc.nextInt();

        notas = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la nota parcial " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }
    }
}
