package org.example.Veiculos;

import java.util.Random;

public class Carro extends Veiculo {

    public Carro() {
    }

    public Carro(String marca, String modelo, String cor) {
        super(marca, modelo, cor);
    }

    @Override
    public void darGrau() {
        System.out.println("\uD83E\uDD26Carro não da grau, Burro!\uD83E\uDD26");
    }

    @Override
    public void mover() {
        Random rand = new Random();
        int rng = rand.nextInt(-1, 10);
        if (rng == -1) {
            System.out.println("Seu carro quebrou!");
        }else{
            System.out.println("Você esta andando de carro");
        }
    }
}
