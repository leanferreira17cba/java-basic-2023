package interfaces2;

public class PersonaInglesa implements Persona, Mamifero {

    @Override
    public void saludar() {
        System.out.println("Hi! How are you?");
    }

    @Override
    public void caminar() {
        System.out.println("I'm walking like a dog");
    }

}
