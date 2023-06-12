package io.codelex.oop.summary.generics;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StorageHouseTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();


    @Test
    public void addMoreItemsTest() {
        StorageHouse<String> storageHouse = new StorageHouse<>("firstItem");
        storageHouse.addMoreItems("secondItem");
        storageHouse.addMoreItems("thirdItem");
        storageHouse.addMoreItems("fourthItem");

        assertEquals("secondItem", storageHouse.items.get(1));
        assertEquals("thirdItem", storageHouse.items.get(2));
        assertEquals("fourthItem", storageHouse.items.get(3));

    }

    @Test
    public void getMaybeFirstItemTest() {
        StorageHouse<Integer> storageHouse = new StorageHouse(15);
        Optional<Integer> optional = Optional.of(15);
        assertEquals(15, storageHouse.getMaybeFirstItem().orElse(null));


    }


    @Test
    public void printItemsTest() {
        StorageHouse<BigDecimal> storageHouse = new StorageHouse(new BigDecimal(10));
        storageHouse.addMoreItems(new BigDecimal(16));
        storageHouse.addMoreItems(new BigDecimal(78));
        storageHouse.addMoreItems(new BigDecimal(56));
        storageHouse.addMoreItems(new BigDecimal(333));
        storageHouse.addMoreItems(new BigDecimal(568));
        System.setOut(new PrintStream(outputStreamCaptor));
        storageHouse.printItems();
        assertEquals("10\n16\n78\n56\n333\n568", outputStreamCaptor.toString().trim());
    }
}

