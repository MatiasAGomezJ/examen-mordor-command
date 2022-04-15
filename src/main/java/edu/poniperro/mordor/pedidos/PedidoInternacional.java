package edu.poniperro.mordor.pedidos;

import edu.poniperro.mordor.interfaces.Pedido;

public class PedidoInternacional implements Pedido {
    private final String id = "1";
    private String destino;
    private int peso;

    public PedidoInternacional(String destino, int peso) {
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
