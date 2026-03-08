package guessNumber;

public class Main {
    static void main() {
        // se non usi static nella classe guessNumber devi creare un nuovo oggetto per usare i metodi della classe guessNumber
        // se usi static puoi non creare un oggetto e usare direttamente GuessNumber.metodo
        GuessNumber g = new GuessNumber();
        g.game();
    }
}
