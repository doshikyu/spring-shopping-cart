package pro.sky.shoppingcart.service;

import pro.sky.shoppingcart.model.ShoppingCartItem;

public class ShoppingCartServiceImpl implements ShoppingCartService {

    ShoppingCartItem shoppingCartItem;

    public ShoppingCartServiceImpl(ShoppingCartItem shoppingCartItem) {
        this.shoppingCartItem = shoppingCartItem;
    }


    @Override
    public String addItem() {
        return "";
    }

    @Override
    public String getItem() {
        return "";
    }
}
