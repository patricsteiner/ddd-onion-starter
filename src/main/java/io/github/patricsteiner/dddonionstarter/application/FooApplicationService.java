package io.github.patricsteiner.dddonionstarter.application;

import io.github.patricsteiner.dddonionstarter.domain.model.FooId;
import io.github.patricsteiner.dddonionstarter.domain.repository.FooRepository;
import io.github.patricsteiner.dddonionstarter.domain.stereotype.ApplicationService;

@ApplicationService
public class FooApplicationService {

    private final FooRepository fooRepository;

    public FooApplicationService(FooRepository fooRepository) {
        this.fooRepository = fooRepository;
    }

    public void doStuffWithFoo(FooId id) {
        var foo = fooRepository.find(id).orElseThrow();
        foo.doStuff();
        fooRepository.save(foo);
    }

}
