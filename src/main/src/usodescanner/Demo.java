package usodescanner;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido/a"); // "\n"

        //char[] arreglo = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};

        //char elemento = arreglo[4];

        for (int indice = 1; indice < 4; indice++) {
            System.out.print("Ingrese su nombre: ");
            scanner.next(); // bug
            String nombre = scanner.nextLine();


            System.out.print("Ingrese su edad: ");
            byte edad = scanner.nextByte();

            System.out.println("El usuario se llama: " + nombre + " y tiene " + edad + " años.");

            //Persona p = new Persona(nombre, edad)

            //arreglo[indice] = p
        }

        scanner.close();



        // for para listar lo que tenga ese arreglo
    }

}
