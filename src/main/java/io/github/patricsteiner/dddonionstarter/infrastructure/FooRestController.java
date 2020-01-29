package io.github.patricsteiner.dddonionstarter.infrastructure;

import io.github.patricsteiner.dddonionstarter.application.FooApplicationService;
import io.github.patricsteiner.dddonionstarter.domain.model.FooId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class FooRestController {

    private final FooApplicationService fooApplicationService;

    @Autowired
    public FooRestController(FooApplicationService fooApplicationService) {
        this.fooApplicationService = fooApplicationService;
    }

    public void doStuff() {
        fooApplicationService.doStuffWithFoo(FooId.of("some-foo"));
    }

}
