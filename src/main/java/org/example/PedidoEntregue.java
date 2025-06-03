package org.example;

public class PedidoEntregue extends PedidoEstado {

    PedidoEntregue() {}
    ;

    private static PedidoEntregue instance = new PedidoEntregue();

    public static PedidoEntregue getInstance() {
        return instance;
    }

    @Override
    public String getDescription() {
        return "Pedido entregue";
    }
}