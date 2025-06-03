package org.example;
import java.util.Observable;
import java.util.Observer;

public class Usuario implements Observer {
    private String usuarioId, nome, lastNotification;

    public Usuario(String usuarioId, String nome) {
        this.usuarioId = usuarioId;
        this.nome = nome;
    }

    public void fazerPedido(Pedido pedido) {
        pedido.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        this.lastNotification = this.nome + ", status to pedido " + o.toString();
    }

    public String getLastNotification() {
        return this.lastNotification;
    }

    public String getUsuarioId() {
        return usuarioId;
    }

    public String getNome() {
        return nome;
    }
}