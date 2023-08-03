package interfaces;

public interface Vendible { // ible, able

    // finalidad de una interfaz es definir los comportamientos que tendrá
    // cierta clase pero no define como logrará alcanzar los resultados definidos en su firma

    String MEDIO_DE_PAGO = "Tarjeta de crédito"; // constante -> cuyo valor no cambia

    float conocerPrecioEnEfectivo(); // firma

    boolean vender(String comprador, float montoPagado);
}
