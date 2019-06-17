package stepic.nemchinovrp.one;

import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaUtil {
    public static <T, R> Function<T, R> unchecked(ThrowingFunction<T, R> f) {
        return t -> {
            try {
                return f.apply(t);
            } catch (Exception ex) {
                return sneakyThrow(ex);
            }
        };
    }

    @SuppressWarnings("unchecked")
    private static <T extends Exception, R> R sneakyThrow(Exception t) throws T {
        throw (T) t; // ( ͡° ͜ʖ ͡°)
    }

    /**
     * .forEach(rethrowConsumer(name -> System.out.println(Class.forName(name))));
     */
    public static <T, E extends Exception> Consumer<T> rethrowConsumer(ConsumerWithExceptions<T, E> consumer) throws E {
        return t -> {
            try {
                consumer.accept(t);
            } catch (Exception exception) {
                throwActualException(exception);
            }
        };
    }

    /**
     * .map(rethrowFunction(name -> Class.forName(name))) or .map(rethrowFunction(Class::forName))
     */
    @SuppressWarnings("unused")
    public static <T, R, E extends Exception> Function<T, R> rethrowFunction(FunctionWithExceptions<T, R, E> function) throws E {
        return t -> {
            try {
                return function.apply(t);
            } catch (Exception exception) {
                throwActualException(exception);
                return null;
            }
        };
    }

    @SuppressWarnings("unchecked")
    private static <E extends Exception> void throwActualException(Exception exception) throws E {
        throw (E) exception;
    }

    @FunctionalInterface
    public interface ConsumerWithExceptions<T, E extends Exception> {
        void accept(T t) throws E;
    }

    @FunctionalInterface
    public interface FunctionWithExceptions<T, R, E extends Exception> {
        R apply(T t) throws E;
    }

    public interface ThrowingFunction<T, R> {
        R apply(T t) throws Exception;
    }
}
