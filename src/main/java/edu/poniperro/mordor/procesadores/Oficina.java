package edu.poniperro.mordor.procesadores;

import edu.poniperro.mordor.interfaces.Pedido;
import edu.poniperro.mordor.interfaces.Procesador;
import edu.poniperro.mordor.interfaces.TratamientoPedido;

public class Oficina implements Procesador {

    public Oficina() {

    }

    @Override
    public boolean procesa(TratamientoPedido pedido) {
        return pedido.tratar();
    }

    public String printarStatus(boolean status, Pedido pedido) {
        return "No.";
    }

}
