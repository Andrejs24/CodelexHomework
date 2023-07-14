package io.codelex.advance_exercise.second_exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BasketTest {

    @Test
    public void appleBasketTest() {
        Basket<Apple> appleBasket = new Basket<>();

        for (int i = 0; i < 10; i++) {

            appleBasket.addToBasket(new Apple());


            assertEquals(i + 1, appleBasket.getCurrentNumberOfItems());
        }


        assertThrows(BasketFullException.class, () -> appleBasket.addToBasket(new Apple()));
    }


    @Test
    public void mushroomBasketTest() throws BasketFullException {
        Basket<Mushroom> mushroomBasket = new Basket<>();

        for (int i = 0; i < 10; i++) {
            mushroomBasket.addToBasket(new Mushroom());

            assertEquals(i + 1, mushroomBasket.getCurrentNumberOfItems());
        }

        assertThrows(BasketFullException.class, () -> mushroomBasket.addToBasket(new Mushroom()));
    }


    @Test
    public void removeFromBasketTest() {
        
        Basket<Apple> appleBasket = new Basket<>();

        assertThrows(BasketEmptyException.class, appleBasket::removeFromBasket);
    }

}
