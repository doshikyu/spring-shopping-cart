package pro.sky.shoppingcart.model;

import java.util.Objects;

public class ShoppingCartItem {
    private int id;

    public ShoppingCartItem(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingCartItem that = (ShoppingCartItem) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ID = " + this.id;
    }
}
