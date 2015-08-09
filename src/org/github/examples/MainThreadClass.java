package org.github.examples;

/**
 * Created by dba on 8/9/15.
 */
public class MainThreadClass {
    public static void main(String[] args) {
        Thareds object = new Thareds();
        Thread thread_runnable = new Thread(object);
        thread_runnable.start();
    }
}
