package org.example;

public class PedidoCaminho extends PedidoEstado {

    PedidoCaminho() {}
    ;

    private static PedidoCaminho instance = new PedidoCaminho();

    public static PedidoCaminho getInstance() {
        return instance;
    }


    public String getDescription() {
        return "Pedido a caminho";
    }
}