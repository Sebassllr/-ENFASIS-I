package com.comercio.app.negocio;

import lombok.ToString;

@ToString
public class Tienda {

    private double acumulado;

    public void agregarProductoACarrito(Producto producto, double cantidad, Cliente cliente) {
            cliente.agregarProductoACarrito(producto, cantidad);
    }
}
