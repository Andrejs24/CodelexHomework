package io.codelex.oop.summary.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Order<E extends Item> {
    private List<E> listOfItems;

    public Order() {
        this.listOfItems = new ArrayList<>();
    }

    public void add(E value) {
        listOfItems.add(value);

    }

    public List<E> getListOfItems() {
        return listOfItems;
    }


    public String getOrderText() {
        StringBuilder text = new StringBuilder();
        int maxLength = 70;
        for (int i = 0; i < listOfItems.size(); i++) {
            E item = listOfItems.get(i);
            String line = "= " + (i + 1) + ". " + item.fullInfo();
            if (line.length() < maxLength) {
                int numberOfCharacters = maxLength - (line.length() - 1);
                line = line + String.valueOf(" ").repeat(numberOfCharacters) + "=";
            }

            text.append(line).append(System.lineSeparator());
        }
        return text.toString();
    }


}

