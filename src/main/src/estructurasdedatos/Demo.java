package estructurasdedatos;

import com.sun.source.doctree.SeeTree;
import modelos.Auto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class Demo {

    public static void main(String[] args) {
        correrEjemplosListas();
    }

    public static void correrEjemplosListas() {

        List listado = new ArrayList();

        listado.add(54); // 1
        listado.add("soy un string"); // 2
        listado.add(true); // 3
        listado.add(456.54f);
        listado.add(54);


        // listado.remove(0);

        // System.out.println(listado.get(0) + " " + listado.get(4));

        // <>

        Set set = new TreeSet();

        set.add(54);
        set.add(54);
        set.add(54);
        set.add(54);
        set.add(54);
        set.add(54);
        set.add(54);
        set.add(54);

        System.out.println(set.size());

        // Map -> K key | V value

        Map<String, String> mapa = new TreeMap<>();

        mapa.put("primero", "Hola");
        mapa.put("segundo", "soy segundo q tal");
        mapa.put("segundo", "abcde");

        Set<String> keys = mapa.keySet();

        // keys.forEach(x -> System.out.println(x)); // expresion lambda // Consumer

        Object[] list = keys.toArray();

        for (int y = 0; y < list.length; y++) {
            //System.out.println(list[y]);
        }

        //System.out.println(mapa.get("segundo"));

        // Queue

        Queue queue = new LinkedList();


        queue.add("Soy el segundo elemento"); // FIFO
        queue.add("Soy el tercer elemento");
        queue.add("Soy el primer elemento");

        System.out.println("Tamaño antes del poll() " + queue.size());
        System.out.println(queue.poll());
        System.out.println("Tamaño despues del poll() " + queue.size());


        Stack stack = new Stack();

        stack.add(1);
        stack.add(2);
        stack.add(98);
        stack.add(876);

        System.out.println("Tamaño antes del pop() " + stack.size());
        System.out.println(stack.pop());
        System.out.println("Tamaño despues del poll() " + stack.size());
    }

    public static void correrEjemplosDeArreglos() {
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
        System.out.println(arrayAutos[1] + " " + arrayAutos[0] + " " + arrayAutos[2] +
                " " + arrayAutos.length);

        // quiero guardar el historico de precios de un auto
        Auto miAuto = new Auto();
        miAuto.setPrecio(100);
        miAuto.setPrecio(1000);
        miAuto.setPrecio(10000);

        System.out.println(miAuto.getHistorial()[0] + " " + miAuto.getHistorial()[1] +
                " " + miAuto.getHistorial()[2]);
    }

}
