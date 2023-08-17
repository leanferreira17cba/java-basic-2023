package estructurasdecontrol;

import modelos.Telefono;

public class Demo {

    public static void main(String[] args) {

        int[] ints = {1, 123, 1, 1, 1, 1, 11, 345, 373, 441, 5, 5, 1, 15, 7, 50};

        // for

        for (int y = 0; y < 12; y++) {
            if (y == 10) {
                continue;
            }
            System.out.println(y);
        }

        // while

        int indice = 0;

        while (true) {
            if (ints[indice] % 2 == 0) {
                System.out.println("El valor par es el número: " + ints[indice]);
                break;
            }

            indice++;
        }

        System.out.println("Termino de girar/iterar el bucle");

        // do while -> ejecuta codigo al menos 1 vez si la condicion es false


        boolean flag = true;
        int counter = 0;

        while (flag) {
            System.out.println("Estoy dentro del while");
        }

        do {
            counter++;
            System.out.println("La condicion es verdadera");
            if (counter > 12) {
                flag = false;
            }

        } while (flag);

        // break continue

        // switch

        int dia = 0;

        if (dia == 1) {
            System.out.println("Lunes");
            if (true) {
                // se conoce como if anidado
            }

        } else if (dia == 2) {
            System.out.println("Martes");
        } else if (dia == 3) {
            System.out.println("Miercoles");
        } else if (dia == 4){
            System.out.println("Jueves");
        } else if (dia == 5){
            System.out.println("Viernes");
        } else if (dia == 6) {
            System.out.println("Sabado");
        } else {
            System.out.println("Domingo");
        }


        // switch

        char diaChar = 'x'; // 1 - 7 // 1 lunes, 2 martes, 7 domingo

        // 1 - 5 dia de semana // 6 - 7 fin de semana

        switch (diaChar) {
            case 'l':
            case 'm':
            case 'x':
            case 'j':
            case 'v':
                System.out.println("Dia de semana");
                break;
            case 's':
            case 'd':
                System.out.println("Fin de semana");
        }

    }




}
