package pro.sky.shoppingcart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.shoppingcart.service.ShoppingCartService;

@RestController
public class ShoppingCartController {

    ShoppingCartService shoppingCartService;

    @GetMapping(path = "/add")
    public String addItem(@RequestParam("itemId") int itemId) {
        return shoppingCartService.addItem();
    }

    @GetMapping(path = "/get")
    public String getItems() {
        return shoppingCartService.getItem();
    }
}
