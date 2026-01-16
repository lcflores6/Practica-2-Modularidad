package evaluacionnotaminima;
/* PRINCIPIOS APLICADOS:
- ISP (Segregación de Interfaces): Define lo necesario para recalcular las notas.
- LSP (Sustitución de Liskov): Cualquier clase hija puede sustiruir, sin alterar el sistema.
- OCP (Abierto/Cerrado): Permite nuevas reglas sin modificar el código existente.
   PASO DE PARÁMETROS:
- Método double[] actualizarNotas(double notas[]) -> paso por referenica.
    */
public interface IActualizacionNotas {
    double[] actualizarNotas(double notas[]);
}
