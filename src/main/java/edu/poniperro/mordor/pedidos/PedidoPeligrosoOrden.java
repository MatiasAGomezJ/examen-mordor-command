package edu.poniperro.mordor.pedidos;

import edu.poniperro.mordor.interfaces.PedidoPeligroso;

import java.util.UUID;

public class PedidoPeligrosoOrden implements PedidoPeligroso {

    private final String id = UUID.randomUUID().toString();
    private String destino;
    private int peso;
    private String instrucciones;

    public PedidoPeligrosoOrden(String destino, String instrucciones) {
        this.destino = destino;
        this.instrucciones = instrucciones;
    }

    @Override
    public int peso() {
        return this.peso;
    }

    @Override
    public String instrucciones() {
        return this.instrucciones;
    }

    @Override
    public String destino() {
        return this.destino;
    }

    public String getId() {
        return this.id;
    }
}
