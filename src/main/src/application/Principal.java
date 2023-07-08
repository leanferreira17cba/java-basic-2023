package application;


import modelos.Telefono;

class Principal {
    public static void main(String[] args) {
        // esta es la primer linea de ejecucion del programa

        // instanciacion -> instanciar la clase (crear un objeto en memoria a partir de una clase o plantilla o molde)

        // con la palabra reservada "new" creamos una nueva instancia

        Telefono objetoTelefono = new Telefono();
        Telefono objetoTelefono2 = new Telefono();
        Telefono objetoTelefono3 = new Telefono();

        // System.out.println() es un método que nos permite imprimir en pantalla información

        /* para ejecutar el metodo de una instancia escribimos:
           instancia.metodo()
        */

        System.out.println(objetoTelefono3.getColor());
    }

}
