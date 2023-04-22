package com.opeterfreitas.gof;

import com.opeterfreitas.gof.singleton.SingletonEager;
import com.opeterfreitas.gof.singleton.SingletonLazy;
import com.opeterfreitas.gof.singleton.SingletonLazyHolder;
import com.opeterfreitas.gof.strategy.*;

public class Test {
    public static void main(String[] args) {

        // Singleton:

        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        // Strategy:

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agresivo = new ComportamentoAgresivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agresivo);
        robo.mover();
        robo.mover();
        robo.mover();

    }
}
