package com.mrtlptkn.A8_Generics;

// T herhangi bir tip demek
// T class da olabilir, interface de olabilirdi. T yerine herhangi bir value type da olabilir.
public class GenericBox<T> {
    private final T type;

    public GenericBox(T type) {
        this.type = type;
    }

    public T getType() {
        return type;
    }

}
