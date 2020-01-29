package io.github.patricsteiner.dddonionstarter.domain.stereotype;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * A DomainEvent is an immutable event that is relevant to the business domain.
 */
@Target(TYPE)
@Documented
@Retention(RUNTIME)
public @interface DomainEvent {
}
