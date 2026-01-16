package evaluacionnotaminima;

public class EvaluacionNotaMinima {

    public static void main(String[] args) {
        
        System.out.println("===== EVALUACION DE NOTAS MINIMAS =====");
        CalculoPromedio cp = new CalculoPromedio("", "", null);
        cp.ingresarDatos();
        double promedio = cp.calculoPromedio(cp.notas);

        if (!cp.promedio(promedio)) {
            System.out.println("Promedio insuficiente: "+promedio+" Supletorios");
            System.out.println("Actualizando notas... ");
            cp.notas = cp.actualizarNotas(cp.notas);
            promedio = cp.calculoPromedio(cp.notas);
        }else{
            System.out.println("Aprobado");
            cp.notas = cp.actualizarNotas(cp.notas);
            promedio = cp.calculoPromedio(cp.notas);
        }
    cp.mostrar(cp, promedio);
    }
}
    

