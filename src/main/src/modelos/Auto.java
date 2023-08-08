package modelos;

import interfaces.Vendible;

public class Auto implements Vendible {

    public int indice = 0;
    private float[] historial = new float[10];

    public float[] getHistorial() {
        return this.historial;
    }

    private float precio;

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        historial[indice++] = precio;
        this.precio = precio;
    }

    @Override
    public float conocerPrecioEnEfectivo() {
        // implementar ese comportamiento
        // guarde en una variable cuando se consulta el precio en cash

        return precio - 1000000;
    }

    @Override
    public boolean vender(String comprador, float montoPagado) {

        System.out.println("La razon social " + comprador + " acaba de comprar un auto");
        return true;
    }
}
