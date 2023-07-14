package io.codelex.advance_exercise.second_exercise;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {

    private List<T> items;

    public Basket() {
        this.items = new ArrayList<>();
    }

    public void addToBasket(T item) throws BasketFullException {
        if (items.size() >= 10) {
            throw new BasketFullException("Basket is full");
        }
        items.add(item);
        ;
    }

    public void removeFromBasket() throws BasketEmptyException {
        if (items.size() <= 0) {
            throw new BasketEmptyException("Basket is empty");
        }
        items.remove(items.size() - 1);
    }

    public List<T> getItems() {
        return items;
    }

    public int getCurrentNumberOfItems() {
        return items.size();
    }
}
