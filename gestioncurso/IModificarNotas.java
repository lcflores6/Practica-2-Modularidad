package gestioncurso;
/* PRINCIPIOS APLICADOS:
- OCP (Abierto/Cerrado): Cualquier implementacion puede sustituirse sin romper el sistema.
- LSP (Sustitucion de Liskov): Define el contrato para modificar las notas.
    Define el método general para aplicar la penalizacion.
   PASO DE PARÁMETROS:
- Método void modificar(double[] notas) -> paso por referencia.
*/
public interface IModificarNotas {
    void modificar(double[] notas);
}
