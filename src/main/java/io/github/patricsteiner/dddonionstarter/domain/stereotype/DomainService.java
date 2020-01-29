package io.github.patricsteiner.dddonionstarter.domain.stereotype;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * A DomainService implements business logic that is not directly assignable to an aggregate.
 * It can also provide DomainEventHandlers.
 */
@Target(TYPE)
@Documented
@Retention(RUNTIME)
public @interface DomainService {
}
