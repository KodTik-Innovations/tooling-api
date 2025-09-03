package org.kodtik.ide.logging;

public interface Logger {

    void debug(String message);
    void error(String message);
    void failure(String message);
    void info(String message);
    void other(String message);
    void warning(String message);
    void verbose(String message);
    void clear();

    default void d(String message) {
        debug(message);
    }

    default void e(String message) {
        error(message);
    }

    default void f(String message) {
        failure(message);
    }

    default void i(String message) {
        info(message);
    }

    default void o(String message) {
        other(message);
    }

    default void w(String message) {
        warning(message);
    }

    default void v(String message) {
        verbose(message);
    }
}
