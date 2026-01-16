package sistemacalificaciones;

public class SistemaCalificaciones {

    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE CALIFICACIONES FINALES ===");
        Estudiante estudiante = new Estudiante("",null);
        
        estudiante.registrarEstudiante();

        ICalculoPromedio calcular = new CalculadoraPromedio();
        IPenalizacion penalizacion = new PenalizacionMenosUno();
        Reporte reporte = new Reporte();

        double promedioOriginal = calcular.calcular(estudiante.getNotas());
        double promedioPenalizado = penalizacion.aplicar(promedioOriginal);

        reporte.mostrar(estudiante.getNombre(), promedioOriginal, promedioPenalizado);
    }
}
