package io.github.patricsteiner.dddonionstarter.domain.repository;

import io.github.patricsteiner.dddonionstarter.domain.model.Foo;
import io.github.patricsteiner.dddonionstarter.domain.model.FooId;
import io.github.patricsteiner.dddonionstarter.domain.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FooRepository {

    Optional<Foo> find(FooId id);

    void save(Foo foo);

}
