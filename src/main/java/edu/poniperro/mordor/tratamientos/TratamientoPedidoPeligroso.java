package edu.poniperro.mordor.tratamientos;

import edu.poniperro.mordor.interfaces.PedidoPeligroso;
import edu.poniperro.mordor.interfaces.TratamientoPedido;

public class TratamientoPedidoPeligroso implements TratamientoPedido {

    private PedidoPeligroso pedido;

    public TratamientoPedidoPeligroso(PedidoPeligroso pedido) {
        this.pedido = pedido;
    }

    @Override
    public boolean tratar() {
        return false;
    }

    public PedidoPeligroso getPedido() {
        return pedido;
    }
}
