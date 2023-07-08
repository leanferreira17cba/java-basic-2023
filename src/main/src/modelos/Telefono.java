package modelos;

public class Telefono {
    // una clase o tipo está compuesta por: atributos (características, variables) y metodos (acciones)

    // dentro de los metodos mas comunmente utilizados se encuentran los "mutators" -> getters y setters
    String color = "Negro";
    double peso = 5.47D;
    char tipoDeConsumo = 'A';
    String modelo = "Galaxy S20";
    float precio = 100000F;
    float tamano = 5.47F;
    boolean usado = false;
    boolean nuevo = true;

    String marca = "Samsung" ;
    long imei = 99999999999999999L; // -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807 -> 1000000

    /*
    La necesidad de agregar la letra "L" o "l" al final de los literales de tipo long se debe a que,
    de forma predeterminada, los valores literales enteros sin ninguna letra se consideran de tipo int.
    El tipo int tiene un rango más limitado que el tipo long, y si intentas asignar un valor fuera del rango de int
    a una variable de tipo int, se producirá un error de compilación.
    */

    int stock = 9; // -2,147,483,648 a 2,147,483,647
    short cantidadDeCiclosDeLaBateria = 20000; // -32,768 a 32,767
    byte cantidadDeCamaras = 4; // -128 a 127 -> 4
    byte tamanoDeLaMemoriaRam = 16; // -128 a 127 -> Gb 16

    // metodo contructor, para construir una instancia de una clase X
    // esto es un contructor sin parametros
    public Telefono() {
    }


    // modificador de acceso (public, private, protected, etc...) + tipo de retorno (primitivo o tipo objeto, void) +
    // get/set + nombre atributo

    // por convencion se usa get (devolver un valor) y set (configurar un valor nuevo) + ()
    public String getColor() { //getter
        return this.color; // la palabra "this" hace referencia a la instancia actual. Es una autoreferencia.
    }

    // metodos que devuelven algo -> tienen un tipo de retorno y deben agregarse la palabra "return" en su cuerpo
    // metodos que NO devuelven nada -> tipo de retorno es VOID y no debe llevar la palabra "return"

}
