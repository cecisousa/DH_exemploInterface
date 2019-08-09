package br.digitalhouse.exercicioSala;

public class Cachorro extends Animal implements Saudavel {

    public Cachorro(String novaRaca) {
        super(novaRaca);
    }

    @Override
    public boolean animalSaudavel(String diagnotisco) {
        if(diagnotisco != null && !diagnotisco.equals("")){
            System.out.println("O cachorro " + getRaca() + " está com o seguinte diagnóstico: " + diagnotisco);
            return true;
        }else{
            System.out.println("Não possui diagnóstico.");
            return false;
        }
    }

    @Override
    public int calculoIdadeAnimal(int novaIdade) {
        System.out.println("Estamos somando as idades!");
        return getIdade() + novaIdade;
    }

    @Override
    public void seDivertir() {
        System.out.println("O cachorro está se divertindo!");
    }
}
