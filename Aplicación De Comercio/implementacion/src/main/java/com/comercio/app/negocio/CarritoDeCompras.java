package com.comercio.app.negocio;

import com.comercio.app.exceptions.NoProductAvailable;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class CarritoDeCompras {

    private List<Item> itemList = new ArrayList<>();

    public void agregarItem(Producto producto, double cantidad) {
        if(producto.tienenUnidadesDisponibles(cantidad)){
            Item item = ItemCreator.getItem(producto, cantidad);
            itemList.add(item);
        }else {
            throw new NoProductAvailable("Cantidad disponible: " + producto.getUnidadesDisponibles() + " Cantidad solicitada: " + cantidad);
        }
    }

    public Double calcularTotal() {
        return itemList
                .stream()
                .mapToDouble(Item::calcularTotal)
                .sum();
    }

    public void verProductosEnCarrito() {
        System.out.println("************* En el Carrito ***************");
        itemList.forEach(item -> {
            System.out.print(item);
            System.out.println("\t-Total: " + item.calcularTotal());
        });
        System.out.println("Total: " + calcularTotal());
        System.out.println("*******************************************");
    }
}
