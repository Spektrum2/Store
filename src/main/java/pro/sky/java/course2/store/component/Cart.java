package pro.sky.java.course2.store.component;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.java.course2.store.model.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Cart {

    private final List<Item> items;

    public Cart() {
        this.items = new ArrayList<>();
    }
    public List<Item> add(List<Item> items) {
        this.items.addAll(items);
        return this.items;
    }
    public List<Item> add(Item item) {
        this.items.add(item);
        return this.items;
    }

    public List<Item> get() {
        return Collections.unmodifiableList(items);
    }
}
