package Aula11;

public class Cachorro extends Animal{
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    void emitirSom(){
        System.out.println("Au Au");
    }
    void correr(){
        System.out.println("Corre rápido para pegar a bolinha");
    }
}
