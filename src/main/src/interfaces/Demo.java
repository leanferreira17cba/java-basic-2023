package interfaces;

import modelos.Auto;
import modelos.Telefono;

public class Demo {
    public static void main(String[] args) {
        Telefono telefonoNokia = new Telefono();
        telefonoNokia.setPrecio(100000.00F);

        System.out.println("El precio es: " + telefonoNokia.getPrecio());

        // conocer el precio en efectivo (generalmente siempre hay descuento)
        System.out.println("El precio en efectivo es: " + telefonoNokia.conocerPrecioEnEfectivo());

        // quiero comprarlo y me llamo Luis
        System.out.println("El telefono fue vendido: " +
                telefonoNokia.vender("Luis", 80000));

        Auto auto = new Auto();
        auto.setPrecio(4000000);

        System.out.println(auto.conocerPrecioEnEfectivo());
        System.out.println(auto.vender("Vates", 20000));
    }
}
