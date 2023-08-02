package modelos;

import interfaces.Vendible;

public class Auto implements Vendible {

    private float precio;

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
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
