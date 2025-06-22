package org.example;

public class PedidoAdaptador implements PedidoComponente {
    private Pedido pedido;

    public PedidoAdaptador(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public String getDescricao() {
        return "Pedido #" + pedido.getOrderId() + " do restaurante " + pedido.getRestaurantName();
    }

    @Override
    public double getPreco() {
        return 35.0;
    }

    public Pedido getPedidoOriginal() {
        return pedido;
    }
}
