package modelos;

public class Telefono {
    // una clase o tipo está compuesta por: atributos (características, variables) y metodos (acciones)

    // dentro de los metodos mas comunmente utilizados se encuentran los "mutators" -> getters y setters
    private String color; // declarando
    private double peso; // declarado
    private char tipoDeConsumo;
    private String modelo;
    private float precio; // esta expresado en dolares
    private float tamano;
    private boolean usado; // false
    private boolean nuevo; // false

    private String marca;
    private long imei; // -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807 -> 1000000

    /*
    La necesidad de agregar la letra "L" o "l" al final de los literales de tipo long se debe a que,
    de forma predeterminada, los valores literales enteros sin ninguna letra se consideran de tipo int.
    El tipo int tiene un rango más limitado que el tipo long, y si intentas asignar un valor fuera del rango de int
    a una variable de tipo int, se producirá un error de compilación.
    */

    private int stock; // -2,147,483,648 a 2,147,483,647
    private short cantidadDeCiclosDeLaBateria; // -32,768 a 32,767
    private byte cantidadDeCamaras; // -128 a 127 -> 4
    private byte tamanoDeLaMemoriaRam; // -128 a 127 -> Gb 16

    // modificadores de acceso -> private, public, protected y default/package
    private String descripcion;
    String description;

    // metodo contructor, para construir una instancia de una clase X
    // esto es un contructor sin parametros
    public Telefono() {
    }

    public Telefono(double peso, String color) { // sobrecarga de constructor
        this.color = color;
        this.peso = peso;
    }

    //constructor con parametros
    public Telefono(String color, double peso) {
        this.color = color;
        this.peso = peso;
    }

    public Telefono(String color, double peso, int stock) {
        this.color = color;
        this.peso = peso;
        this.stock = stock;
    }

    public Telefono(float precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
// modificador de acceso (public, private, protected, etc...) + tipo de retorno (primitivo o tipo objeto, void) +
    // get/set + nombre atributo

    // por convencion se usa get (devolver un valor) y set (configurar un valor nuevo) + ()
    public String getColor() { //getter
        return this.color; // la palabra "this" hace referencia a la instancia actual. Es una autoreferencia.
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // boolean nuevo = true;

    public boolean isNuevo() {
        return this.nuevo;
    }

    public boolean isUsado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }

    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }

    // metodos que devuelven algo -> tienen un tipo de retorno y deben agregarse la palabra "return" en su cuerpo
    // metodos que NO devuelven nada -> tipo de retorno es VOID y no debe llevar la palabra "return"

    // metodos
    public String llamar(int numeroTelefonico) { //verbos infinitivos (ar, er, ir)
        // llama a lo que te pasen en numeroTelefonico

        return "estaba ocupado"; // en duro
    }
    public Foto tomarFoto() {
        return new Foto(); // en duro
    }
    public String enviarMensaje(String mensaje) {
        return "El mensaje " + "es este: " + mensaje;
    }

    public boolean encender() {
        return true;
    }

    public boolean apagar() {
        return false;
    }

    public void reiniciar() {
        System.out.println("Se reinicia el telefono...");
    }

    // quiero saber el precio del telefono en pesos dada la cotizacion del dolar blue

    public float calcularPrecioEnPesos(float valorDolarBlue) {
        return precio * valorDolarBlue;
    }

}
