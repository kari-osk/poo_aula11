package Aula11;

public class Main {
    public static void main(String[] args) {
        Cachorro mel = new Cachorro("Mel","1");
        mel.emitirSom();
        mel.correr();

        Cavalo bob = new Cavalo("Bob", "7");
        bob.emitirSom();
        bob.correr();

        Preguica pregui = new Preguica("preguicinha", "2");
        pregui.emitirSom();
        pregui.subirArvore();
    }
}
