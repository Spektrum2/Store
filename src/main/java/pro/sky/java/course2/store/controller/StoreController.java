package pro.sky.java.course2.store.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.store.service.StoreService;

import java.util.Set;

@RestController
@RequestMapping("/store/order")
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/add")
    public void addItem(@RequestParam("item") Integer product) {
        storeService.addItem(product);
    }

    @GetMapping("/get")
    public Set<Integer> getItem() {
        return storeService.getItem();
    }


}
