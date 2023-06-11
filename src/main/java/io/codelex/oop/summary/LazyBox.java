package io.codelex.oop.summary;

import java.util.function.Supplier;

public class LazyBox<T> {

    private Supplier<T> supplier;
    private T value;
    private boolean isValueInitialized = false;

    public LazyBox(Supplier<T> supplier) {
        this.supplier = supplier;

    }

    public T get() {
        if (!isValueInitialized) {
            value = supplier.get();
            isValueInitialized = true;
        }
        return value;
    }
}
