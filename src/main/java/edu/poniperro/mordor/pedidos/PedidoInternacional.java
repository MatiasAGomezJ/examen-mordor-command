package edu.poniperro.mordor.pedidos;

import edu.poniperro.mordor.interfaces.Pedido;

import java.util.UUID;

public class PedidoInternacional implements Pedido {
    private final String id;
    private String destino;
    private int peso;

    public PedidoInternacional(String destino, int peso) {
        this.id = UUID.randomUUID().toString();
        this.destino = destino;
        this.peso = peso;
    }

    public int peso() {
        return this.peso;
    }

    public String destino() {
        return this.destino;
    }

    public String getId() {
        return this.id;
    }
}
