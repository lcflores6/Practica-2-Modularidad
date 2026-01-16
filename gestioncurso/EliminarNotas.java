package gestioncurso;
/* PRINCIPIOS APLICADOS:
- LSP (Sustitucion de Liskov): Cumple el contrato sin cambiar nada, puede reemplazarse por otra regla sin afectar al sistema.
   PASO DE PARÁMETROS:
- Método public void modificar(double[] notas) -> paso por referencia.
*/
public class EliminarNotas implements IModificarNotas{

    @Override
    public void modificar(double[] notas) {
    for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 8) {
                notas[i] = 0;
            }
    }    
    }  
}
