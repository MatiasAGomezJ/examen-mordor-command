package edu.poniperro.mordor.tratamientos;

import edu.poniperro.mordor.interfaces.TratamientoPedido;
import edu.poniperro.mordor.pedidos.PedidoInternacional;

public class TratamientoPedidoInternacional implements TratamientoPedido {

    PedidoInternacional pedido;

    public TratamientoPedidoInternacional(PedidoInternacional pedido) {
        this.pedido = pedido;
    }

    @Override
    public boolean tratar(){
        return pedido.destino() != "Mordor";
    }

    public PedidoInternacional getPedido() {
        return pedido;
    }
}
