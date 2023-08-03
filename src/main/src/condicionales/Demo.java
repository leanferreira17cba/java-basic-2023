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
            System.out.println("No se le otorga el carnet por ser menor de 18 años");
        }

    }
}
