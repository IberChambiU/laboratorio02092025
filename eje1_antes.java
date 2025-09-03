// 1. Ejemplo de Code Smell y Refactoring
// Código con problemas (Code Smells)

public class ProcesadorPedidos {

    public void procesar(
        int idCliente,
        String nombreCliente,
        String direccionCliente,
        List<Integer> idsProductos,
        List<Integer> cantidades,
        boolean descuento,
        double porcentajeDescuento,
        boolean envioExpress,
        String metodoPago
    ) {

        // Cálculo del total (lógica duplicada en otros lugares)
        double total = 0;
        for (int i = 0; i < idsProductos.size(); i++) {
            double precio = obtenerPrecioProducto(idsProductos.get(i));
            total += precio * cantidades.get(i);
        }

        if (descuento) {
            total = total - (total * porcentajeDescuento);
        }

        if (envioExpress) {
            total += 10.0;
        }

        // Procesamiento confuso
        if (metodoPago.equals("tarjeta")) {
            System.out.println("Procesando pago con tarjeta...");
            // Lógica compleja de procesamiento de tarjeta
        } else if (metodoPago.equals("paypal")) {
            System.out.println("Procesando pago con PayPal...");
            // Lógica compleja de PayPal
        }

        // Más código mezclando responsabilidades
        System.out.println("Enviando email a: " + nombreCliente);
        System.out.println("Dirección de envío: " + direccionCliente);
        System.out.println("Total: $" + total);

        // Lógica de actualización de inventario
        for (int i = 0; i < idsProductos.size(); i++) {
            actualizarInventario(idsProductos.get(i), cantidades.get(i));
        }
    }

    private double obtenerPrecioProducto(int idProducto) {
        // Simulación de base de datos
        return idProducto * 10.0;
    }

    private void actualizarInventario(int idProducto, int cantidad) {
        System.out.println("Actualizando inventario: Producto " + idProducto
                + ", reducido en " + cantidad + " unidades");
    }

    // Método duplicado que existe en otra clase
    public double calcularTotal(List<Integer> idsProductos, List<Integer> cantidades,
            boolean descuento, double porcentajeDescuento) {
        double total = 0;
        for (int i = 0; i < idsProductos.size(); i++) {
            double precio = obtenerPrecioProducto(idsProductos.get(i));
            total += precio * cantidades.get(i);
        }

        if (descuento) {
            total = total - (total * porcentajeDescuento);
        }

        return total;
    }
}

// como se tenia antes era un codigo monolitico no implementaba una clase si no que
// se encargaba de todo el procesamiento en un solo lugar