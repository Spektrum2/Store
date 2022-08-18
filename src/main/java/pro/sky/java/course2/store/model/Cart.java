package pro.sky.java.course2.store.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
@SessionScope
public class Cart {
    private final Set<Integer> id;

    public Cart(int id) {
        this.id = new HashSet<>(List.of(id));
    }

    public Set<Integer> getId() {
        return id;
    }

    public void addId(int id) {
        this.id.add(id);
    }
}
