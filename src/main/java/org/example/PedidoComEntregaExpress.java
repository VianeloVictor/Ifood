package org.example;

public class PedidoComEntregaExpress extends PedidoDecoratorBase {
    public PedidoComEntregaExpress(PedidoComponente pedido) {
        super(pedido);
    }

    @Override
    public String getDescricao() {
        return pedido.getDescricao() + ", com entrega expressa";
    }

    @Override
    public double getPreco() {
        return pedido.getPreco() + 7.5;
    }
}
