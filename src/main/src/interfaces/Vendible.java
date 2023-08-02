package interfaces;

public interface Vendible { // ible, able

    // finalidad de una interfaz es definir los comportamientos que tendrá
    // cierta clase pero no define como logrará alcanzar los resultados definidos en su firma

    float conocerPrecioEnEfectivo(); // firma

    boolean vender(String comprador, float montoPagado);
}
