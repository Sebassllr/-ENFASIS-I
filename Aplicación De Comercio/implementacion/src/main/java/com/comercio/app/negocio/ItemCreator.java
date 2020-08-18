package com.comercio.app.negocio;

import com.comercio.app.exceptions.NotSupportedCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ItemCreator {

    special("SP"), regular("EA"), weight("WE");
    private String type;

    public static Item getItem(Producto producto, double cantidad) {
        ItemCreator itemType = getItemType(producto);
        assert itemType != null;
        switch(itemType){
            case special: {
                return new SpItem(cantidad, producto);
            }
            case regular: {
                return new EaItem(cantidad, producto);
            }
            case weight: {
                return new WeItem(cantidad, producto);
            }
            default: {
                throw new NotSupportedCode("Código no encontrado");
            }
        }
    }

    private static ItemCreator getItemType(Producto producto) {
        String name = producto.getSku();
        for(ItemCreator itemCreator : ItemCreator.values()) {
            if(name != null && name.startsWith(itemCreator.getType())){
                return itemCreator;
            }
        }
        return null;
    }
}