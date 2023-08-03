package interfaces2;

public class Demo {
    public static void main(String[] args) {
        PersonaInglesa personaInglesa = new PersonaInglesa();
        PersonaArgentina personaArgentina = new PersonaArgentina();
        PersonaItaliana personaItaliana = new PersonaItaliana();

        personaInglesa.caminar();
        personaArgentina.caminar();
        personaItaliana.saludar();
    }
}
