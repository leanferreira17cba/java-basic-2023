package application;


import modelos.Telefono;

class Principal {
    public static void main(String[] args) {
        // esta es la primer linea de ejecucion del programa

        // instanciacion -> instanciar la clase (crear un objeto en memoria a partir de una clase o plantilla o molde)

        // con la palabra reservada "new" creamos una nueva instancia

        Telefono objetoTelefonoSamsung = new Telefono(); // operador de asignacion =
        Telefono objetoTelefono2 = null; // declarado -> no está instanciado o inicializado // null -> no contiene nada

        Telefono objetoTelefonoNokia = new Telefono("Nokia", 23D);


        // System.out.println() es un método que nos permite imprimir en pantalla información

        /* para ejecutar el metodo de una instancia escribimos:
           instancia.metodo()
        */

        /*
        objetoTelefono.setColor("verde");
        objetoTelefono.setColor("rosa");

        objetoTelefono.setNuevo(false);
        */

        System.out.println(objetoTelefonoNokia.enviarMensaje("ya llegué"));
    }

}
