package org.example;

public class PedidoComDescontoCupom extends PedidoDecoratorBase {
    public PedidoComDescontoCupom(PedidoComponente pedido) {
        super(pedido);
    }

    @Override
    public String getDescricao() {
        return pedido.getDescricao() + ", com desconto de cupom";
    }

    @Override
    public double getPreco() {
        return pedido.getPreco() - 5.0;
    }
}
