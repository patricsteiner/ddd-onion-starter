package io.github.patricsteiner.dddonionstarter.domain.stereotype;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * An Aggregate is a collection of domain objects that holds domain logic and state. Its members must never be accessed
 * directly, but always via the (root) aggregate. This way the aggregate can guarantee consistency of changes.
 */
@Target(TYPE)
@Documented
@Retention(RUNTIME)
public @interface Aggregate {
}
