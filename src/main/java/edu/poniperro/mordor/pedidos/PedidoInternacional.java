package edu.poniperro.mordor.pedidos;

import edu.poniperro.mordor.interfaces.Pedido;

public class PedidoInternacional implements Pedido {
    private final String id;
    private String destino;
    private int peso;

    public PedidoInternacional(String id, int peso) {
        this.id = id;
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
