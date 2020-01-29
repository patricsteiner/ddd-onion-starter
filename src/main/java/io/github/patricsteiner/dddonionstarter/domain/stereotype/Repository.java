package io.github.patricsteiner.dddonionstarter.domain.stereotype;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * A Repository is responsible for accepting aggregates of a specific type, keeping and returning them as requested by
 * the domain. The repository interface forms part of the domain, the implementation is part of the infrastructure.
 */
@Target(TYPE)
@Documented
@Retention(RUNTIME)
public @interface Repository {
}
