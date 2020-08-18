package com.comercio.app.negocio;

import com.comercio.app.exceptions.NoCorrectQuantity;

public class EaItem extends Item {

    public EaItem(double cantidad, Producto producto) {
        super(cantidad, producto);
        if((cantidad == Math.floor(cantidad)) && !Double.isInfinite(cantidad)) {
            throw new NoCorrectQuantity("La cantidad para este item debe ser entera!");
        }
    }

    @Override
    protected Double calcularTotal() {
        return producto.getPrecio() * cantidad;
    }
}
