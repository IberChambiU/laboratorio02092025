import java.util.List;

class ProcesadorPedidosRefactor {
    public void procesar(Pedido pedido) {
        double total = calcularTotal(pedido.items, pedido.tieneDescuento, pedido.porcentajeDescuento);
        if (pedido.envioExpress) {
            total += 10.0;
        }
        procesarPago(pedido.metodoPago);
        enviarEmail(pedido.nombreCliente, pedido.direccionCliente, total);
        actualizarInventario(pedido.items);
    }

    private double calcularTotal(List<ItemPedido> items, boolean descuento, double porcentajeDescuento) {
        double total = 0;
        for (ItemPedido item : items) {
            double precio = obtenerPrecioProducto(item.idProducto);
            total += precio * item.cantidad;
        }
        if (descuento) {
            total -= total * porcentajeDescuento;
        }
        return total;
    }

    private double obtenerPrecioProducto(int idProducto) {
        return idProducto * 10.0;
    }

    private void procesarPago(String metodoPago) {
        switch (metodoPago) {
            case "tarjeta":
                System.out.println("Procesando pago con tarjeta...");
                break;
            case "paypal":
                System.out.println("Procesando pago con PayPal...");
                break;
            default:
                System.out.println("Método de pago no soportado");
        }
    }

    private void enviarEmail(String nombreCliente, String direccionCliente, double total) {
        System.out.println("Enviando email a: " + nombreCliente);
        System.out.println("Dirección de envío: " + direccionCliente);
        System.out.println("Total: $" + total);
    }

    private void actualizarInventario(List<ItemPedido> items) {
        for (ItemPedido item : items) {
            System.out.println("Actualizando inventario: Producto " + item.idProducto +
                    ", reducido en " + item.cantidad + " unidades");
        }
    }
}
