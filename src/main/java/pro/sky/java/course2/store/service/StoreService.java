package pro.sky.java.course2.store.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.store.component.Cart;
import pro.sky.java.course2.store.model.Item;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StoreService {
    private final Cart cart;

    public StoreService(Cart cart) {
        this.cart = cart;
    }

    public List<Item> addItem(List<Integer> ids) {
        return  cart.add(ids.stream()
                .map(Item::new)
                .collect(Collectors.toList()));
    }

    public List<Item> getItem() {
        return cart.get();
    }


}
