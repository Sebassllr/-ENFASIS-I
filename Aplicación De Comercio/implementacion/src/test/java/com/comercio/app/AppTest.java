package com.comercio.app;

import com.comercio.app.negocio.Item;
import com.comercio.app.negocio.Producto;
import com.comercio.app.negocio.SpItem;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class AppTest{

//    private Item buildItem(Item item, Producto producto, Double precio, int cantidad) {
//        producto.setPrecio(precio);
//        item.setProducto(producto);
//        item.setCantidad(cantidad);
//        return item;
//    }
//
//    @DataProvider(name = "quantityAndPercentage")
//    private Object[][] quantityAndPercentage() {
//        return new Object[][]{
//                {buildItem(new SpItem(), new Producto(), 200D, 3), (double) (20 / 100)},
//                {buildItem(new SpItem(), new Producto(), 200D, 4), (double) (20 / 100)},
//                {buildItem(new SpItem(), new Producto(), 200D, 5), (double) (20 / 100)},
//                {buildItem(new SpItem(), new Producto(), 200D, 6), (double) (40 / 100)},
//                {buildItem(new SpItem(), new Producto(), 200D, 7), (double) (40 / 100)},
//                {buildItem(new SpItem(), new Producto(), 200D, 9), (double) (50 / 100)}
//        };
//    }
//
//    @Test(
//            description = "Este test es para probar X",
//            dataProvider = "quantityAndPercentage"
//
//    )
//    public void givenQuantity_WhenCalculationDiscount_ThenReturnDiscountPercentage(SpItem item, Double expectedPercentage) {
//        assertEquals(expectedPercentage, item.calcularDescuento());
//    }
}
