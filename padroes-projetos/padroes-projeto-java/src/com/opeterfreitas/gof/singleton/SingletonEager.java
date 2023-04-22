package com.opeterfreitas.gof.singleton;

/**
 * Singleton "Apressado".
 *
 * @author opeterfreitas
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instancia;
    }
}
