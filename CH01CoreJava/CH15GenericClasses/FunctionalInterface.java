package CH01CoreJava.CH15GenericClasses;



/*
 * Understanding Functional Interfaces in Java
 */

/*
 * A Functional Interface is an interface that contains exactly one abstract method.
 * They can have multiple default or static methods, but only one abstract method.
 * Also known as Single Abstract Method (SAM) interfaces.
 *
 * Key Features:
 * - Can be used with lambda expressions
 * - Can be used with method references
 * - @FunctionalInterface annotation for compile-time validation
 * - Foundation for Java 8+ functional programming features
 *
 * Built-in Functional Interfaces (java.util.function):
 * - Function<T,R>: Takes T, returns R
 * - Consumer<T>: Takes T, returns void
 * - Supplier<T>: Takes nothing, returns T
 * - Predicate<T>: Takes T, returns boolean
 * - UnaryOperator<T>: Function<T,T>
 * - BinaryOperator<T>: BiFunction<T,T,T>
 * - BiFunction<T,U,R>: Takes T and U, returns R
 *
 * Benefits:
 * - Enables functional programming
 * - Lambda expression support
 * - Cleaner, more readable code
 * - Better support for parallel processing


public class FunctionalInterface {
}
