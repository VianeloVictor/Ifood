package org.example;
import java.util.Observable;


public class Pedido extends Observable {
    private String pedidoId, nomeRestaurante;

    private PedidoEstado estado;

    public Pedido(String pedidoId, String nomeRestaurante) {
        this.pedidoId = pedidoId;
        this.nomeRestaurante = nomeRestaurante;
        this.estado = PedidoConfirmado.getInstance();
    }

    public void setEstado(PedidoEstado estado) {
        this.estado = estado;
        this.setChanged();
        this.notifyObservers(
                "Seu pedido #%s do %s está com status: %s"
                        .formatted(this.pedidoId, this.nomeRestaurante, this.estado.getDescription()));
    }

    public String getOrderId() {
        return pedidoId;
    }

    public String getRestaurantName() {
        return nomeRestaurante;
    }

    public PedidoEstado getEstado() {
        return estado;
    }
}