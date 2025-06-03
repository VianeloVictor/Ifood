package org.example;

public class PedidoFactoryExpress implements PedidoFactory {
    private static PedidoFactoryExpress instance;

    private PedidoFactoryExpress() {}

    public static PedidoFactoryExpress getInstance() {
        if (instance == null) {
            instance = new PedidoFactoryExpress();
        }

        return instance;
    }


    public Pedido criarPedido(String pedidoId, String nomeRestaurante) {
        var pedido = new Pedido(pedidoId + "-EXPRESS", nomeRestaurante);
        return pedido;
    }
}