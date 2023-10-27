package model;

import business.Comportamiento;

public class ComportamientoUno implements Comportamiento {
    @Override
    public void ejecutar() {
        System.out.println("Ejecutando Comportamiento Uno.");
    }

}
