package com.comercio.app.negocio;

import com.comercio.app.exceptions.NoCorrectQuantity;

public class SpItem extends Item{

    private Double porcentaje = null;

    public SpItem(double cantidad, Producto producto) {
        super(cantidad, producto);
        if(!((cantidad == Math.floor(cantidad)) && !Double.isInfinite(cantidad))) {
            throw new NoCorrectQuantity("La cantidad para este item debe ser entera!");
        }
    }

    @Override
    protected Double calcularTotal() {
        if(porcentaje == null) porcentaje = calcularDescuento();
        return (producto.getPrecio() * cantidad) * (1 - porcentaje);
    }

    public Double calcularDescuento() {
        double porcentaje = 0;
        double cantidadTemp = cantidad;
        while(porcentaje < 50 && cantidadTemp >= 3) {
            cantidadTemp -= 3;
            porcentaje += 20;
            if(porcentaje > 50) {
                porcentaje = 50;
            }
        }
        return porcentaje == 0 ? 1 : porcentaje / 100;
    }
}
