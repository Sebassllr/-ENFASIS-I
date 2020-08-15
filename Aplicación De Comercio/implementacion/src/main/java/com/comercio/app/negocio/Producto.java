package com.comercio.app.negocio;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Producto {

    private String sku;
    private String nombre;
    private String decripcion;
    private int unidadesDisponibles;
    @Setter private double precio;

    public Boolean tienenUnidadesDisponibles(double cantidad) {
        return unidadesDisponibles >= cantidad;
    }

    @Override
    public String toString() {
        return "Sku: " + this.getSku() + "\t-Nombre: " + this.getNombre() + "\t-Precio: " + this.getPrecio() + "\t-Descripción: " + this.getDecripcion();
    }
}
