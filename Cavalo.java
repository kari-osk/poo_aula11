package Aula11;

public class Cavalo extends Animal{
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    void emitirSom(){
        System.out.println("prrrruhh");
    }
    void correr(){
        System.out.println("Rápido como um cavalo");
    }
}
