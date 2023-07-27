package pasoporvalor;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        int a = 5;
        int b = 90;

        calcular(a, b);

        System.out.println(b);


        Persona persona = new Persona("Ana");

        System.out.println(persona.nombre);

        modificar(persona);

        System.out.println(persona.nombre);
    }

    public static int calcular(int aCopia, int bCopia) {
        // a y b son copias
        return aCopia + bCopia * aCopia / bCopia % aCopia;
    }

    public static void modificar(Persona persona) {
        // persona es una referencia al original
        persona.nombre = "Maria";
    }
}

class Persona {
    String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }
}