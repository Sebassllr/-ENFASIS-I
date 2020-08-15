package com.comercio.app.negocio;

public class WeItem extends Item {

    public WeItem(double cantidad, Producto producto) {
        super(cantidad, producto);
    }

    @Override
    protected Double calcularTotal() {
        return cantidad * 1000 * producto.getPrecio();
    }
}
