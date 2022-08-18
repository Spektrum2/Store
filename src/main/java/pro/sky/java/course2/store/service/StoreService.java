package pro.sky.java.course2.store.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.store.model.Cart;

import java.util.List;

@Service
public class StoreService {
    private final Cart cart;

    public StoreService(Cart cart) {
        this.cart = cart;
    }

    public void addItem(int item) {
        cart.addId(item);
    }

    public List<Integer> getItem() {
        return cart.getId();
    }


}
