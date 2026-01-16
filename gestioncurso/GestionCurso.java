package gestioncurso;

public class GestionCurso {

    public static void main(String[] args) {
        System.out.println("=== GESTION DEL CURSO ===");
        Estudiante estudiante = new Estudiante("",null);
        
        estudiante.registrarEstudiante();

        IModificarNotas regla = new EliminarNotas();
        ICalculoPromedio calculadora = new CalculadoraPromedio();
        Reporte reporte = new Reporte();
        
        regla.modificar(estudiante.getNotas());

        double promedio = calculadora.calcular(estudiante.getNotas());

        reporte.mostrar(estudiante.getNombre(), estudiante.getNotas(), promedio);
    }
}
