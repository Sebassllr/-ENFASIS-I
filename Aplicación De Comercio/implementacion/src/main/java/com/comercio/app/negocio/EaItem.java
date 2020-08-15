package com.comercio.app.negocio;

public class EaItem extends Item {

    public EaItem(double cantidad, Producto producto) {
        super(cantidad, producto);
    }

    @Override
    protected Double calcularTotal() {
        return producto.getPrecio() * cantidad;
    }
}
