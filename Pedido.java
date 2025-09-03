import java.util.List;

class Pedido {
    int idCliente;
    String nombreCliente;
    String direccionCliente;
    List<ItemPedido> items;
    boolean tieneDescuento;
    double porcentajeDescuento;
    boolean envioExpress;
    String metodoPago;

    public Pedido(int idCliente, String nombreCliente, String direccionCliente,
                  List<ItemPedido> items, boolean tieneDescuento,
                  double porcentajeDescuento, boolean envioExpress, String metodoPago) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.direccionCliente = direccionCliente;
        this.items = items;
        this.tieneDescuento = tieneDescuento;
        this.porcentajeDescuento = porcentajeDescuento;
        this.envioExpress = envioExpress;
        this.metodoPago = metodoPago;
    }
}
