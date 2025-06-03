package org.example;

public class PedidoCaminho extends PedidoEstado {

    PedidoCaminho() {}
    ;

    private static PedidoCaminho instance = new PedidoCaminho();

    public static PedidoCaminho getInstance() {
        return instance;
    }

    @Override
    public String getDescription() {
        return "Pedido a caminho";
    }
}