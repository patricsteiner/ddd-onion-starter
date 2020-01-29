package io.github.patricsteiner.dddonionstarter.domain.stereotype;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * A DomainEventHandler is responsible for handling a DomainEvent.
 */
@Target(METHOD)
@Documented
@Retention(RUNTIME)
public @interface DomainEventHandler {
}
