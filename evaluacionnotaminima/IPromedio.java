package evaluacionnotaminima;
/* PRINCIPIOS APLICADOS:
- ISP (Segregación de Interfaces): Define solo lo necesario para cálculo de promedio.
- LSP (Sustitución de Liskov): Cualquier clase hija puede sustiruir sin alterar el sistema.
    PASO DE PARÁMETROS:
- Método double calculoPromedio(double notas[]) -> paso por referenica.
- Método boolean promedio(double promedio) -> paso por valor.
- Método double calculoNuevoPromedio(double notas[]) -> paso por referencia.
    */
public interface IPromedio {
    double calculoPromedio(double notas[]);
    boolean promedio(double promedio);
    double calculoNuevoPromedio(double notas[]);
}

