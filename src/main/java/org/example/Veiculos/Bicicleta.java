package org.example.Veiculos;

public class Bicicleta extends Veiculo {

    public Bicicleta() {
    }

    public Bicicleta(String marca, String modelo, String cor) {
        super(marca, modelo, cor);
    }

    @Override
    public void mover() {
        System.out.println("Você está pedalando sua bicicleta " + super.getMarca() + "!\uD83D\uDC4D");
    }

    @Override
    public void darGrau() {
        super.darGrau();
    }
}
