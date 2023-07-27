package herencia;

public class Hija extends Madre {

    // sub clase -> super clase
    @Override
    public String toString() {
        return super.getApellido();
    }

}
