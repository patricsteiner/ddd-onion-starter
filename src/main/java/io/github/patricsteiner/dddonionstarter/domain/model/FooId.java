package io.github.patricsteiner.dddonionstarter.domain.model;

import io.github.patricsteiner.dddonionstarter.domain.stereotype.ValueObject;

@ValueObject
public class FooId {

    private final String value;

    private FooId(String value) {
        if (value == null || value.length() == 0) {
            throw new IllegalArgumentException();
        }
        this.value = value;
    }

    public static FooId of(String value) {
        return new FooId(value);
    }

    public String value() {
        return value;
    }

}
