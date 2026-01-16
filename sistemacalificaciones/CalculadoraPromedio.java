package sistemacalificaciones;
/* PRINCIPIOS APLICADOS:
- SRP (Responsabilidad Única): Solo calcula el promedio.
- DIP (Inversion de Dependencias): Implementa una interfaz, depende de un módulo de alto nivel.
   PASO DE PARÁMETROS:
- Método public double calcular (double[] notas) -> paso por referencia.
   Retorna un valor.
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
