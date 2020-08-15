package com.comercio.app.negocio;

import lombok.Data;

@Data
public abstract class Item {

    protected double cantidad;
    protected Producto producto;

    public Item(double cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    abstract protected Double calcularTotal();

    @Override
    public String toString() {
        return this.producto.toString() + "\t-Cantidad de compra: " + this.cantidad;
    }
}
