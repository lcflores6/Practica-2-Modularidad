package sistemacalificaciones;
/* PRINCIPIOS APLICADOS:
- OCP (Abierto/Cerrado): Permite agregar nuevas penalizaciones sin modificar el sistema.
- DIP (Inversion de Dependencias): Depende de un módulo de alto nivel, interface.
    Define el método general para aplicar la penalizacion.
   PASO DE PARÁMETROS:
- Método double aplicar(double promedio) -> paso por valor.
   Retorna un valor.
*/
public interface IPenalizacion {
    double aplicar(double promedio);
}
