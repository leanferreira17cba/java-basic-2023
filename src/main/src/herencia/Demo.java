package herencia;

public class Demo {
    public static void main(String[] args) {
        Hijo pepito = new Hijo();
        Hija martita = new Hija();

        // polimorfismo -> responder a un mismo mensaje pero de una
        // manera personalizada, custom, etc...
        System.out.println(pepito.saludar());
        System.out.println(martita.saludar());
    }
}
