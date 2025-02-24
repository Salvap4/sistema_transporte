package transporte;

public class Coche extends Vehiculo implements ConMotor {

    public Coche (int velocidadMaxima) {
        super(velocidadMaxima);
    }

    @Override
    public void describir() {
        System.out.println("Soy un coche que puede alcanzar "+getVelocidadMaxima()+" km/h.\n");
    }

    @Override
    public void encenderMotor() {
        System.out.println("El motor del coche está encendido.");
    }
}
