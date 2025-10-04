package org.example.Veiculos;


public class Veiculo {
    private String marca;
    private String modelo;
    private String cor;

    public Veiculo() {

    }

    public Veiculo(String marca, String modelo, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    public void mover() {
        System.out.println("Seu veiculo " + marca + ", modelo " + modelo + ", esta se movendo");
    }

    public void mostrarDados() {
        System.out.println("Marca: " + marca + "\nModelo: " + modelo + "\nCor: " + cor);
    }

    public void darGrau() {
        System.out.println("\uD83D\uDEB4Você esta dando grau\uD83D\uDEB4");
    }



    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}

