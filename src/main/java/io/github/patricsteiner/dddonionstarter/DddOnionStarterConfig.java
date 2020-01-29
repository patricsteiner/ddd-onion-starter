package io.github.patricsteiner.dddonionstarter;


import io.github.patricsteiner.dddonionstarter.application.FooApplicationService;
import io.github.patricsteiner.dddonionstarter.domain.repository.FooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DddOnionStarterConfig {

    @Autowired
    public FooRepository fooRepository;

    @Bean
    public FooApplicationService fooApplicationService() {
        return new FooApplicationService(fooRepository);
    }

}
