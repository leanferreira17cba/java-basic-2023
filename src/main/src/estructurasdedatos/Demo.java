package estructurasdedatos;

import modelos.Auto;

public class Demo {

    public static void main(String[] args) {
        // arreglo de caracteres (char)

        // represente caracteres
        char[] lista = new char[9]; // un arreglo en Java es un Object

        // 'a' 'b' 'c' 'd' 'e' 'f' 'g' 'h' 'i'


        lista[0] = 'a';
        lista[1] = 'b';
        lista[2] = 'c';
        lista[3] = 'd';
        lista[4] = 'e';
        lista[5] = 'f';
        lista[6] = 'g';
        lista[7] = 'h';
        lista[8] = 'i';

        lista[7] = '3';


        // {}

        char[] charArray = {'a', 'b', 'c', 'd'};

        Auto[] arrayAutos = new Auto[5];
        arrayAutos[0] = new Auto();
        arrayAutos[1] = new Auto();

        // como le pongo un precio al auto que esta guardado en el elemento 0 del arreglo
        arrayAutos[0].setPrecio(100);
        arrayAutos[0].setPrecio(1000);
        arrayAutos[0].setPrecio(3456);

        arrayAutos[1].setPrecio(20);

        arrayAutos[0] = arrayAutos[1];
        arrayAutos[2] = arrayAutos[0];

        Auto[] arregloDeAutos = {new Auto(), new Auto(), new Auto(), new Auto()};

        System.out.println(arregloDeAutos);
        System.out.println(arrayAutos[1] + " " + arrayAutos[0] + " " + arrayAutos[2] + " " + arrayAutos.length);


        // quiero guardar el historico de precios de un auto
        Auto miAuto = new Auto();
        miAuto.setPrecio(100);
        miAuto.setPrecio(1000);
        miAuto.setPrecio(10000);

        System.out.println(miAuto.getHistorial()[0] + " " + miAuto.getHistorial()[1] + " " + miAuto.getHistorial()[2]);
    }

}
