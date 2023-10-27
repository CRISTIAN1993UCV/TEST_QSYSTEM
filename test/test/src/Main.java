import business.Comportamiento;
import model.ComportamientoDos;
import model.ComportamientoUno;
import model.Persona;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 1
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("12345678", "Gomez", "Perez"));
        personas.add(new Persona("98765432", "Lopez", "Rodriguez"));
        personas.add(new Persona("56789012", "Martinez", "Garcia"));

        System.out.println("Lista desordenada:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        Comparator<Persona> comparador = Comparator
                .comparing(Persona::getDni)
                .thenComparing(Persona::getApellidoPaterno);

        Collections.sort(personas, comparador);

        System.out.println("\nEjercicio 1 Lista ordenada:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        System.out.println("\nEjercicio 2 Lista ordenada:");


        comportamientoCentroDistribucion("ICA");

        System.out.println("\nEjercicio 3 Compartamientos:");
        Comportamiento comportamiento1 = new ComportamientoUno();
        Comportamiento comportamiento2 = new ComportamientoDos();
        comportamiento1.ejecutar();
        comportamiento2.ejecutar();


    }
    public static void comportamientoCentroDistribucion(String centro) {
        switch (centro) {
            case "CentroA":
                System.out.println("Comportamiento del Centro de Distribución A: Entrega a tiempo.");
                break;
            case "CentroB":
                System.out.println("Comportamiento del Centro de Distribución B: Almacenamiento eficiente.");
                break;
            case "CentroC":
                System.out.println("Comportamiento del Centro de Distribución C: Enfoque en calidad.");
                break;
            default:
                System.out.println("Comportamiento predeterminado del Centro de Distribución:...");
        }
    }


}