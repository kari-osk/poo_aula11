package Aula11;

public class Preguica extends Animal {
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    void emitirSom(){
        System.out.println("Bocejandooo");
    }
    void subirArvore(){
        System.out.println("Já vou subir");
    }
}

