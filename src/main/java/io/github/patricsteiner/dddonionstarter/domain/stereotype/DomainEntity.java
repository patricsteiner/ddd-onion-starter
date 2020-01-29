package io.github.patricsteiner.dddonionstarter.domain.stereotype;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * A DomainEntity is a domain object that is defined by its consistent thread of continuity and its identity,
 * not by its attributes (as opposed to a ValueObject).
 * It should never be mutated directly, but always via its aggregate root. Therefore no mutating methods must be public.
 * A DomainEntity is a concept of domain-driven design and should not be confused with e.g. a JPA entity.
 */
@Target(TYPE)
@Documented
@Retention(RUNTIME)
public @interface DomainEntity {
}
