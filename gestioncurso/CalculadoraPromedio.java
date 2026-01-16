package gestioncurso;
/* PRINCIPIO APLICADO:
- SRP (Responsabilidad Única): Solo calcula el promedio.
   PASO DE PARÁMETROS:
- Método public double calcular(double[] notas)-> paso por referencia.
*/
public class CalculadoraPromedio implements ICalculoPromedio {

    @Override
    public double calcular(double[] notas) {
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma = suma +notas[i];
        }
         return (suma / notas.length);    
    }   
}
