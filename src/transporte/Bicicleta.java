package transporte;

public class Bicicleta extends Vehiculo implements SinMotor {

    public Bicicleta(int velocidadMaxima) {
        super(velocidadMaxima);
    }

    @Override
    public void describir() {
        System.out.println("soy una bicicleta con una velocidad máxima de "+getVelocidadMaxima()+" km/h.\n");
    }

    @Override
    public void usarFuerzaHumana() {
        System.out.println("Usando fuerza humana para mover la bicicleta.");
    }
}
