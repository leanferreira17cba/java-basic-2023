package herencia;

public class Madre {

    private String colorDeOjos = "Marrones"; // atributo de la clase
    private String apellido = "Gallardo";

    public String saludar() {
        return "Hola que tal señor.";
    }

    protected String getApellido() {
        return this.apellido;
    }

    protected void setApellido(String apellido) {
        this.apellido = apellido;
    }

}
