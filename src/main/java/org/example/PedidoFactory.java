package org.example;

public interface PedidoFactory {
    Pedido criarPedido(String pedidoId, String nomeRestaurante);
}
