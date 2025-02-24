package transporte;

public class Barco extends Vehiculo implements ConMotor {

    public Barco(int velocidadMaxima) {
        super(velocidadMaxima);
    }

    @Override
    public void describir() {
        System.out.println("Soy un barco que navega a "+getVelocidadMaxima()+" km/h.\n");
    }

    @Override
    public void encenderMotor() {
        System.out.println("El motor del barco está encendido.");
    }
}
