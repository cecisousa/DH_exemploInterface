package br.digitalhouse.exercicioSala;

public class Pessoa extends Animal implements Saudavel, Brincavel {

    public Pessoa (String novaRaca){
        super(novaRaca);
    }

    @Override
    public void seDivertir() {

    }

    @Override
    public boolean animalSaudavel(String diagnotisco) {
        return false;
    }

    @Override
    public int calculoIdadeAnimal(int novaIdade) {
        return 0;
    }
}
