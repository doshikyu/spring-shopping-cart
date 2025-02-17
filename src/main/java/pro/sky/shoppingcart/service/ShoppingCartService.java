package pro.sky.shoppingcart.service;

import org.springframework.stereotype.Service;

@Service
public interface ShoppingCartService {
    String addItem();

    String getItem();
}
