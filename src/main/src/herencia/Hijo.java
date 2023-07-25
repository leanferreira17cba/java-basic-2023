package herencia;

public class Hijo extends Madre {
    // Madre es una superclase
    // Hijo es una subclase

    boolean tieneTatuajes = true;

    public String tomarBebidasAlcoholicas() {
        return "Si, tomo birra";
    }

    @Override
    public String saludar() {
        return "Q hace loco";
    }

}
