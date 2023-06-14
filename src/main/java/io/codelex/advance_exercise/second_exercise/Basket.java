package io.codelex.advance_exercise.second_exercise;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {

    private List<T> items;
    private int currentNumberOfItems;

    public Basket() {
        this.items = new ArrayList<>();
        this.currentNumberOfItems = 0;
    }

    public void addToBasket(T item) throws BasketFullException {
        if (currentNumberOfItems >= 10) {
            throw new BasketFullException("Basket is full");
        }
        items.add(item);
        currentNumberOfItems++;
    }

    public void removeFromBasket() throws BasketEmptyException {
        if (currentNumberOfItems <= 0) {
            throw new BasketEmptyException("Basket is empty");
        }
        items.remove(currentNumberOfItems - 1);
        currentNumberOfItems--;
    }

    public List<T> getItems() {
        return items;
    }

    public int getCurrentNumberOfItems() {
        return currentNumberOfItems;
    }
}
