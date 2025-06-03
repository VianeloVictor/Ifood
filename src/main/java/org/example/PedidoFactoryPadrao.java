package org.example;

public class PedidoFactoryPadrao implements PedidoFactory {
    private static PedidoFactoryPadrao instance;

    private PedidoFactoryPadrao() {
    }

    public static PedidoFactoryPadrao getInstance() {
        if (instance == null) {
            instance = new PedidoFactoryPadrao();
        }

        return instance;
    }


    public Pedido criarPedido(String pedidoId, String nomeRestaurante) {
        var pedido = new Pedido(pedidoId + "-STANDARD", nomeRestaurante);
        return pedido;
    }
}