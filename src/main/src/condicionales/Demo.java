package condicionales;

public class Demo {
    public static void main(String[] args) {

        // if -> si pasa algo...
        // () -> validar/comprobar // si y solo si el resultado es "true"
        // {} -> entonces se ejecuta lo que este adentro de las llaves

        // == != < > <= >= && || -> valor boolean T ó F

        // !

        int edad = 12;
        int edadMinimaParaRecibirCarnetDeConducir = 18;

        // if (!(edad >= edadMinimaParaRecibirCarnetDeConducir)) { // 12 mayor o igual a 18 años -> false
        if (edad >= edadMinimaParaRecibirCarnetDeConducir) { // 12 mayor o igual a 18 años -> false
            System.out.println("Si, tome su carnet");
        } else {
            // print
            // llamar a cierto metodo, ejecutar algun bloque de codigo, etc...
            System.out.println("No se le otorga el carnet por ser menor de 18 años");
        }

    }
}
