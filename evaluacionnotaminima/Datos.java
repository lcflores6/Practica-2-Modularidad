package evaluacionnotaminima;
/* PRINCIPIOS APLICADOS:
- SRP (Responsabilidad Única): Se encarga únicamente de definir los datos del estudiante.
- LSP (Sustitución de Liskov): Cualquier clase hija puede sustiruir a Datos sin alterar el sistema.
    PASO DE PARÁMETROS:
- Método public Datos(String nombre, String asignatura, double[] notas):
    String nombre -> paso por valor.
    String asignaura -> paso por valor.
    double notas[] -> paso por referencia.
    */
public abstract class Datos {
    String nombre;
    String asignatura;
    double notas[];

    public Datos(String nombre, String asignatura, double[] notas) {
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.notas = notas;
    }
    
    abstract void ingresarDatos();
}
