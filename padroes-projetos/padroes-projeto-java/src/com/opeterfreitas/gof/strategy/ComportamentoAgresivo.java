package com.opeterfreitas.gof.strategy;

public class ComportamentoAgresivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Movendo-se agressivamente...");
    }
}
