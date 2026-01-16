package evaluacionnotaminima;
/* PRINCIPIOS APLICADOS:
- ISP (Segregación de Interfaces): Define solo lo necesario para mostrar datos.
- LSP (Sustitución de Liskov): Cualquier clase hija puede sustiruir, sin alterar el sistema.
    PASO DE PARÁMETROS:
- Método void mostrar(Datos d, double promedio):
    Datos d -> paso por valor.
    double promedio -> paso por valor
    */
public interface IMostrarPromedio {
    void mostrar(Datos d, double promedio);
}
