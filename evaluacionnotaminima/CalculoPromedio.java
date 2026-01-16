package evaluacionnotaminima;
/* PRINCIPIOS APLICADOS:
- SRP (Responsabilidad Única): Se encarga únicamente de definir los datos del estudiante.
*/
import java.util.*;

public class CalculoPromedio extends Datos implements IPromedio, IActualizacionNotas, IMostrarPromedio {

    public CalculoPromedio(String nombre, String asignatura, double[] notas) {
        super(nombre, asignatura, notas);
    }

    @Override
    public double calculoPromedio(double[] notas) {// paso por referencia.
        double suma = 0;
        
        for (int i = 0; i < notas.length ; i++) {
            suma = suma + notas[i];
        }
        return (suma / notas.length);
    }

    @Override
    public boolean promedio(double promedio) {//paso por valor double promedio.
        return promedio >= 10;
    }

    @Override
    public double[] actualizarNotas(double[] notas) {// paso por referencia.      
        for (int i = 0; i < notas.length; i++) {
                if(notas[i] < 10){
                    notas[i] = 10;
            }else{
                    notas[i] = notas[i];
                }
        }
        return notas;
    }
    
    @Override
    public double calculoNuevoPromedio(double[] notas) {// paso por referencia.
        double sumaf = 0;
        
        for (int i = 0; i < notas.length ; i++) {
            sumaf = sumaf + notas[i];
        }
        return (sumaf / notas.length);
    }

    @Override
    public void mostrar(Datos d, double promedio) {//paso por valor Datos d y double promedio.
        System.out.println("=== REPORTE DEL ESTUDIANTE ===");
        System.out.println("Nombre: "+d.nombre);
        System.out.println("Asignatura: "+d.asignatura);
        System.out.println("Promedio Final: " +calculoNuevoPromedio(this.notas));
    }

    @Override
    void ingresarDatos() {       
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del estudiante: ");
        this.nombre = sc.nextLine();
        System.out.print("Ingrese la asignatura: ");
        this.asignatura = sc.nextLine();
        System.out.print("Cuantas notas desea registra ? ");
        int n = sc.nextInt();
        sc.nextLine();
        
        this.notas = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            this.notas[i] = sc.nextDouble();
        }
        
    }
}
