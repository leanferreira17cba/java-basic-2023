package interfaces2;

public class PersonaArgentina implements Persona, Mamifero {

    @Override
    public void saludar() {
        System.out.println("Hola que haces");
    }

    @Override
    public void caminar() {
        System.out.println("estoy caminando porque soy mamifero");
    }

}
