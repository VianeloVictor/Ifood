package org.example;

public class PedidoConfirmado extends PedidoEstado {
    PedidoConfirmado() {}
    ;

    private static PedidoConfirmado instance = new PedidoConfirmado();

    public static PedidoConfirmado getInstance() {
        return instance;
    }

    @Override
    public boolean cancelado(Pedido pedido) {
        pedido.setEstado(PedidoCancelado.getInstance());
        return true;
    }

    @Override
    public boolean preparando(Pedido pedido) {
        pedido.setEstado(PedidoPreparo.getInstance());
        return true;
    }

    @Override
    public String getDescription() {
        return "Pedido confirmado";
    }
}