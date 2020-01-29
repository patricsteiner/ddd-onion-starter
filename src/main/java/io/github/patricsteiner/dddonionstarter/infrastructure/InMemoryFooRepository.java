package io.github.patricsteiner.dddonionstarter.infrastructure;

import io.github.patricsteiner.dddonionstarter.domain.model.Foo;
import io.github.patricsteiner.dddonionstarter.domain.model.FooId;
import io.github.patricsteiner.dddonionstarter.domain.repository.FooRepository;
import io.github.patricsteiner.dddonionstarter.domain.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class InMemoryFooRepository implements FooRepository {

    private Map<FooId, Foo> data = new HashMap<>();

    @Override
    public Optional<Foo> find(FooId id) {
        return Optional.ofNullable(data.get(id));
    }

    @Override
    public void save(Foo foo) {
        data.put(foo.id(), foo);
    }

}
