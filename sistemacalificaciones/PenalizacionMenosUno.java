package sistemacalificaciones;
/* PRINCIPIOS APLICADOS:
- OCP (Abierto/Cerrado): Se puede cambiar la penalizacion creando otra clase.
- DIP (Inversion de Dependencias): Depende de un módulo de alto nivel, interface. IPenalizacion
   PASO DE PARÁMETROS:
- Método public double aplicar(double promedio) -> paso por valor.
   Retorna un valor.
*/
public class PenalizacionMenosUno implements IPenalizacion{

    @Override
    public double aplicar(double promedio) {
        return promedio - 1;
    }
}
