// 2. Ejemplo de Cómo Obtener Código Limpio
// codigo claro (despues)

class CalculadoraEstadisticasLimpio {
    public void imprimirEstadisticas(double[] numeros) {
        double media = calcularMedia(numeros);
        double varianza = calcularVarianza(numeros, media);
        double desviacion = Math.sqrt(varianza);
        System.out.println("Media: " + media);
        System.out.println("Varianza: " + varianza);
        System.out.println("Desviación estándar: " + desviacion);
    }

    private double calcularMedia(double[] numeros) {
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }

    private double calcularVarianza(double[] numeros, double media) {
        double suma = 0;
        for (double num : numeros) {
            suma += Math.pow(num - media, 2);
        }
        return suma / numeros.length;
    }
}

// La clase CalculadoraEstadisticasLimpio ahora es más legible y fácil de mantener
// se han utilizado nombres de variables más descriptivos