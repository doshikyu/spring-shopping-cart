package pro.sky.shoppingcart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.shoppingcart.service.ShoppingCartService;

@RestController
@RequestMapping("/order")
public class ShoppingCartController {
    private final ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping(path = "/add")
    public String addItem(@RequestParam("itemId") Integer[] itemId) {
        return shoppingCartService.addItem(itemId);
    }

    @GetMapping(path = "/get")
    public String getItems() {
        return shoppingCartService.getItem();
    }
}
