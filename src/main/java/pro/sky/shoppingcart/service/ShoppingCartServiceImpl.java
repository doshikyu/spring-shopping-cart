package pro.sky.shoppingcart.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.shoppingcart.model.ShoppingCartItem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@SessionScope
public class ShoppingCartServiceImpl implements ShoppingCartService {
    private final Set<ShoppingCartItem> shoppingCart;

    public ShoppingCartServiceImpl() {
        shoppingCart = new HashSet<>();
    }

    @Override
    public String addItem(Integer[] itemIds) {
        return Arrays.stream(itemIds)
                .filter(id -> shoppingCart.add(new ShoppingCartItem(id)))
                .collect(Collectors.toSet())
                .toString();
    }

    @Override
    public String getItem() {
        return shoppingCart.toString();
    }
}
