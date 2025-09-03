// 2. Ejemplo de Cómo Obtener Código Limpio
// Código poco claro (antes)

public class CalculadoraEstadisticas {
    public void p(double[] n) {
        double t = 0;
        for (double num : n) {
            t += num;
        }
        double m = t / n.length;
        System.out.println("Media: " + m);
       
        double v = 0;
        for (double num : n) {
            v += Math.pow(num - m, 2);
        }
        v = v / n.length;
        System.out.println("Varianza: " + v);
       
        double d = Math.sqrt(v);
        System.out.println("Desviación: " + d);
    }
}

// como se tenia antes era un codigo monolitico no implementaba una clase si no que
// se encargaba de todo el procesamiento en un solo lugar
// ademas los nombres no son legibles y se pierde la lectura del codigo