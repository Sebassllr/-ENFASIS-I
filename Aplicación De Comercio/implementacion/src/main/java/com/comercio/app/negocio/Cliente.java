package com.comercio.app.negocio;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cliente {

    private String nombre;
    private String nit;
    private CarritoDeCompras carritoDeCompras;

    public void agregarProductoACarrito(Producto producto, double cantidad) {
        carritoDeCompras.agregarItem(producto, cantidad);
    }

    public void verCarrito() {
        carritoDeCompras.verProductosEnCarrito();
    }
}
