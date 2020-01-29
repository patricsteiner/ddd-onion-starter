package io.github.patricsteiner.dddonionstarter.domain.stereotype;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * An ApplicationService is the outermost layer of the application core. It is used mainly for orchestration
 * and communication from the infrastructure to the application core. It therefore barely contains any business logic.
 */
@Target(TYPE)
@Documented
@Retention(RUNTIME)
public @interface ApplicationService {
}
