package pro.sky.java.course2.store.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.store.model.Item;
import pro.sky.java.course2.store.service.StoreService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/add")
    public List<Item> addItem(@RequestParam("item") List<Integer> product) {
        return storeService.addItem(product);
    }

    @GetMapping("/get")
    public List<Item> getItem() {
        return storeService.getItem();
    }


}
