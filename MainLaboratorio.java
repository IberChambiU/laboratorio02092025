public class MainLaboratorio {
    public static void main(String[] args) {
        // Ejemplo de uso de ProcesadorPedidosRefactor
        java.util.List<ItemPedido> items = new java.util.ArrayList<>();
        items.add(new ItemPedido(1, 2)); // Producto 1, cantidad 2
        items.add(new ItemPedido(2, 1)); // Producto 2, cantidad 1
        Pedido pedido = new Pedido(101, "Juan Perez", "Av. Siempre Viva 123", items, true, 0.1, true, "tarjeta");
        ProcesadorPedidosRefactor procesador = new ProcesadorPedidosRefactor();
        procesador.procesar(pedido);

        // Ejemplo de uso de CalculadoraEstadisticasLimpio
        double[] numeros = {10, 20, 30, 40, 50};
        CalculadoraEstadisticasLimpio calc = new CalculadoraEstadisticasLimpio();
        calc.imprimirEstadisticas(numeros);
    }
}
