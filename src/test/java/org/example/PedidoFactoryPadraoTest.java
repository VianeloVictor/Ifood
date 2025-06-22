package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoFactoryPadraoTest {
    private String pedidoId, nomeRestaurante;
    private Usuario usuario;
    private Pedido pedidoPadrao, pedidoExpress;
    private String buildExpectedMessage(String estado, String tipoEntrega) {
        return "Seu pedido #%s-%s do %s está com status: %s"
                .formatted(this.pedidoId, tipoEntrega, this.nomeRestaurante, estado);
    }

   @BeforeEach
    void setUp() {
        this.nomeRestaurante = "restaurante 01";
        this.pedidoId = "pedido 01";
        this.pedidoPadrao = PedidoFactoryPadrao.getInstance().criarPedido(pedidoId, nomeRestaurante);
        this.pedidoExpress = PedidoFactoryExpress.getInstance().criarPedido(pedidoId, nomeRestaurante);
        this.usuario = new Usuario("#0001", "usuario 01");
    }

    @Test
    public void NotificarPreparoPadraoPreparando() {
        this.usuario.fazerPedido(pedidoPadrao);
        this.pedidoPadrao.preparando();

        var expectedMessage = this.buildExpectedMessage("Pedido em preparação", "STANDARD");

        assertEquals(expectedMessage, usuario.getLastNotification());
    }
    @Test
    public void NotificarPreparoExpressoPreparando() {
        this.usuario.fazerPedido(this.pedidoExpress);
        this.pedidoExpress.preparando();

        var expectedMessage = this.buildExpectedMessage("Pedido em preparação", "EXPRESS");

        assertEquals(expectedMessage, usuario.getLastNotification());
    }

    @Test
    public void NotificarExpressoCancelado() {
        this.usuario.fazerPedido(this.pedidoExpress);
        this.pedidoExpress.preparando();

        var expectedMessage = this.buildExpectedMessage("Pedido em preparação", "EXPRESS");

        assertEquals(expectedMessage, usuario.getLastNotification());

        this.pedidoExpress.cancelado();

        expectedMessage = this.buildExpectedMessage("Pedido cancelado", "EXPRESS");

        assertEquals(expectedMessage, usuario.getLastNotification());
    }
    @Test
    public void TestarDecorator() {
        Pedido pedidoOriginal = new Pedido("123", "Restaurante do Zé");

        PedidoComponente pedidoBase = new PedidoAdaptador(pedidoOriginal);

        PedidoComponente pedidoDecorado = new PedidoComEntregaExpress(
                new PedidoComDescontoCupom(pedidoBase));

        System.out.println(pedidoDecorado.getDescricao());
        System.out.println("Valor final: R$" + pedidoDecorado.getPreco());
    }
}
