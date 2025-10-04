package org.example;

public class Cachorro {
    private String name;
    private String race;
    private int age;

    public Cachorro() {
    }

    public Cachorro(int age) {
        this.age = age;
    }

    public Cachorro(String name) {
        this.name = name;
    }

    public Cachorro(String name, String race) {
        this.name = name;
        this.race = race;
    }

    public Cachorro(String name, String race, int age) {
        this.name = name;
        this.race = race;
        this.age = age;
    }

    public void latir() {
        System.out.print("au-au\n");
    }

    public void mostrarDados() {
        System.out.println("Nome: " + name + "\nIdade: " + age + "\nRaça: " + race);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
