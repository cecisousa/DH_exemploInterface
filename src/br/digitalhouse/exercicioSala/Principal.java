package br.digitalhouse.exercicioSala;

public class Principal {
    public static void main(String[] args) {
        Cachorro novoCachorro = new Cachorro("Golden");

        boolean retornoMetodo = novoCachorro.animalSaudavel("sem doenças!");
        System.out.println(retornoMetodo);

        novoCachorro.setIdade(10);
        int idadeAnimal = novoCachorro.calculoIdadeAnimal(90);
        System.out.println("A idade total é: " + idadeAnimal);
    }
}
