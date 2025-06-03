package org.example;

public abstract class PedidoEstado {
    public abstract String getDescription();

    public boolean confirmado(Pedido pedido) {
        return false;
    }

    public boolean preparando(Pedido pedido) {
        return false;
    }

    public boolean Caminho(Pedido pedido) {
        return false;
    }

    public boolean entregue(Pedido pedido) {
        return false;
    }

    public boolean cancelado(Pedido pedido) {
        return false;
    }
}