package io.github.patricsteiner.dddonionstarter.domain.model;

import io.github.patricsteiner.dddonionstarter.domain.stereotype.Aggregate;

@Aggregate
public class Foo {

    private final FooId id;

    public static Foo of(FooId id) {
        return new Foo(id);
    }

    private Foo(FooId id) {
        this.id = id;
    }

    public FooId id() {
        return id;
    }

    public void doStuff() {

    }

}
