package model;

import business.Comportamiento;

public class ComportamientoDos implements Comportamiento {
    @Override
    public void ejecutar() {
        System.out.println("Ejecutando Comportamiento Dos.");
    }
}
