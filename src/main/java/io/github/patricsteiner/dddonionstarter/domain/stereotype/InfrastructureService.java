package io.github.patricsteiner.dddonionstarter.domain.stereotype;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * An InfrastructureService is an interface in the domain with an implementation in the infrastructure that must be
 * injected at runtime.
 */
@Target(TYPE)
@Documented
@Retention(RUNTIME)
public @interface InfrastructureService {
}
