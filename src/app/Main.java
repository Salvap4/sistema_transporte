package app;

import transporte.*;

public class Main {

    public static void main(String[] args) {
        Coche coche1 = new Coche(180);
        Bicicleta bicicleta1 = new Bicicleta(30);
        Barco barco1 = new Barco(50);
        Avion avion1 = new Avion(900);

        coche1.arrancar();
        coche1.encenderMotor();
        coche1.describir();

        bicicleta1.arrancar();
        bicicleta1.usarFuerzaHumana();
        bicicleta1.describir();

        barco1.arrancar();
        barco1.encenderMotor();
        barco1.describir();

        avion1.arrancar();
        avion1.encenderMotor();
        avion1.describir();
    }
}
