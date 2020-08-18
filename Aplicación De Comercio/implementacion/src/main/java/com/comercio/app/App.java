package com.comercio.app;

import com.comercio.app.exceptions.NoProductAvailable;
import com.comercio.app.exceptions.NotSupportedCode;
import com.comercio.app.filereader.CSVReader;
import com.comercio.app.negocio.CarritoDeCompras;
import com.comercio.app.negocio.Cliente;
import com.comercio.app.negocio.Producto;
import com.comercio.app.negocio.Tienda;

import java.util.List;
import java.util.Scanner;

public class App {

    final List<Producto> productos = CSVReader.readCSV();
    private final Scanner scanner = new Scanner(System.in);
    private final Tienda tienda = new Tienda();
    private final Cliente cliente = new Cliente("Daniela Villegas", "1053", new CarritoDeCompras());

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
