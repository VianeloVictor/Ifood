package org.example;

public class PedidoCancelado extends PedidoEstado {
    PedidoCancelado() {
    }

    ;

    private static PedidoCancelado instance = new PedidoCancelado();

    public static PedidoCancelado getInstance() {
        return instance;
    }

    @Override
    public String getDescription() {
        return "Pedido cancelado";
    }
}