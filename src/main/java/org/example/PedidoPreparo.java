package org.example;

public class PedidoPreparo extends PedidoEstado {

    PedidoPreparo() {}
    ;

    private static PedidoPreparo instance = new PedidoPreparo();

    public static PedidoPreparo getInstance() {
        return instance;
    }


    public boolean cancelado(Pedido pedido) {
        pedido.setEstado(PedidoCancelado.getInstance());
        return true;
    }


    public boolean caminho(Pedido pedido) {
        pedido.setEstado(PedidoCaminho.getInstance());
        return true;
    }


    public String getDescription() {
        return "Pedido em preparação";
    }
}