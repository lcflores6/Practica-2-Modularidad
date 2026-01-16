package sistemacalificaciones;
/* PRINCIPIOS APLICADOS:
- DIP (Inversion de Dependencias): Depende de un módulo de alto nivel, interface.
  Define el método general para calcular los promedios.
   PASO DE PARÁMETROS:
- Método double calcular (double[] notas) -> paso por referencia.
*/
public interface ICalculoPromedio {
    double calcular(double[] notas);
}
