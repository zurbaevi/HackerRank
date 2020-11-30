package com.hackerrank.java.advanced;

/**
 * @author Zurbaevi Nika
 */
public class JavaSingletonPattern {
    private static final JavaSingletonPattern instance = null;
    public String str = "";

    private JavaSingletonPattern() {

    }

    public static JavaSingletonPattern getSingleInstance() {
        if (instance == null)
            return new JavaSingletonPattern();
        return instance;
    }
}
