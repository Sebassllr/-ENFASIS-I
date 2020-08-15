package com.comercio.app;

import com.comercio.app.negocio.CarritoDeCompras;
import com.comercio.app.negocio.Cliente;
import com.comercio.app.negocio.Producto;
import com.comercio.app.negocio.Tienda;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {

    List<Producto> productos = new ArrayList<>(Arrays.asList(
            new Producto("WE1234", "Tomates", "Soy un tomate", 3000, 2),
            new Producto("SP1234", "Agucate", "Soy un Agucate", 50, 1800),
            new Producto("EA1234", "Piña", "Soy un Piña", 20, 3200),
            new Producto("SP1234", "Limón", "Soy un Limón", 10, 2),
            new Producto("EA1234", "Lulo", "Soy un lulo", 15, 300),
            new Producto("WE1234", "Cebolla", "Soy un Cebolla", 3500, 2.8),
            new Producto("SP1234", "Papa", "Soy un Papa", 12, 200),
            new Producto("EA1234", "Yuca", "Soy un Yuca", 10, 800)
    ));

    private Scanner scanner = new Scanner(System.in);
    private Tienda tienda = new Tienda();
    private Cliente cliente = new Cliente("Daniela Villegas", "1053", new CarritoDeCompras());
    public static void main(String[] args){
        App app = new App();
        app.mainMenu();
    }

    void mainMenu() {

        Boolean salir = Boolean.FALSE;
        do {
            try{
                System.out.println("=============================================");
                System.out.println("1. Agregar Producto a Carrito");
                System.out.println("2. Ver Carrito");
                System.out.println("=============================================");
                int i = scanner.nextInt();
                switch(i) {
                    case 1: {
                        productMenu();
                        break;
                    }
                    case 2: {
                        cliente.verCarrito();
                        break;
                    }
                    case 9: {
                        salir = Boolean.TRUE;
                    }
                }
            } catch(NoProductAvailable | NotSupportedCode ex) {
                System.err.println("No disponible! :(");
                System.err.println(ex.getMessage());
            }
        } while(!salir);

    }

    void productMenu() {
        int option;
        do {
            int i = 1;
            for(Producto prod : productos) {
                System.out.printf("%d-Producto: %s\t\tPrecio: %.0f\t\tCantidad: %d\n", i++, prod.getNombre(), prod.getPrecio(), prod.getUnidadesDisponibles());
            }
            System.out.printf("%d-Salir\n", i);
            option = scanner.nextInt() - 1;
        }while(option > productos.size());
        if(option < productos.size()) {
            System.out.println("Qué cantidad desea?");
            double cantidad = scanner.nextDouble();
            agregarACarrito(productos.get(option), cantidad);
        }
    }

    void agregarACarrito(Producto producto, double cantidad) {
        tienda.agregarProductoACarrito(producto, cantidad, cliente);
    }
}
