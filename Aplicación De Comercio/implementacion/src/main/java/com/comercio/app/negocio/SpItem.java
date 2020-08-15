package com.comercio.app.negocio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

public class SpItem extends Item{

    public SpItem(double cantidad, Producto producto) {
        super(cantidad, producto);
    }

    private Double porcentaje = null;

    @Override
    protected Double calcularTotal() {
        if(porcentaje == null) porcentaje = calcularDescuento();
        return (producto.getPrecio() * cantidad) * porcentaje;
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
