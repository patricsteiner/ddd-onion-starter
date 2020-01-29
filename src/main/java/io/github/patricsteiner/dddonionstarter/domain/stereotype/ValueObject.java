package io.github.patricsteiner.dddonionstarter.domain.stereotype;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * A ValueObject is defined by its state, it has no conceptual identity.
 * It is immutable and therefore thread safe and safe to pass outside the domain.
 * Equality between ValueObject is defined by their internal state.
 */
@Target(TYPE)
@Documented
@Retention(RUNTIME)
public @interface ValueObject {
}
