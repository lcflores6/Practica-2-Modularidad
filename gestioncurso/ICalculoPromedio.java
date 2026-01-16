package gestioncurso;
/* PRINCIPIOS APLICADOS:
- LSP (Sustitucion de Liskov): Define el contrato para el calculo del promedio.
   PASO DE PARÁMETROS:
- Método double calcular(double[] notas) -> paso por referencia.
*/
public interface ICalculoPromedio {
     double calcular(double[] notas);
}
