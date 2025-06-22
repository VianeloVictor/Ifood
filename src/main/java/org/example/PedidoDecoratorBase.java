package org.example;

public abstract class PedidoDecoratorBase implements PedidoComponente {
    protected PedidoComponente pedido;

    public PedidoDecoratorBase(PedidoComponente pedido) {
        this.pedido = pedido;
    }

    @Override
    public String getDescricao() {
        return pedido.getDescricao();
    }

    @Override
    public double getPreco() {
        return pedido.getPreco();
    }
}
