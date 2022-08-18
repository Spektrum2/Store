package pro.sky.java.course2.store.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Cart {
    private final List<Integer> id;

    public Cart(int id) {
        this.id = new ArrayList<>(List.of(id));
    }

    public List<Integer> getId() {
        return id;
    }

    public void addId(int id) {
        this.id.add(id);
    }
}
