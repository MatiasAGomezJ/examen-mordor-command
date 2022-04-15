package edu.poniperro.mordor.tratamientos;

import edu.poniperro.mordor.interfaces.Pedido;
import edu.poniperro.mordor.interfaces.TratamientoPedido;

import java.util.Set;

public class TratamientoPedidoMultiple implements TratamientoPedido {

    private Integer pesoTotal;
    private Long numBultos;
    private Set<Pedido> pedidos;

    public TratamientoPedidoMultiple(Set<Pedido> pedidos) {
        this.pedidos = pedidos;
        calcularPesoTotal();
        calcularTotalBultos();
    }

    @Override
    public boolean tratar() {
        return pedidos.stream().noneMatch(pedido -> pedido.destino() == "Mordor");
    }

    public Integer getPesoTotal() {
        return pesoTotal;
    }

    public Long getNumBultos() {
        return numBultos;
    }

    public void calcularPesoTotal() {
        Integer sumPesoTotal = 0;
        for (Pedido pedido :
                pedidos) {
            sumPesoTotal += pedido.peso();
        }
        this.pesoTotal = sumPesoTotal;
    }

    public void calcularTotalBultos() {
        this.numBultos = Long.valueOf(pedidos.size());
    }
}