import java.util.Random;
import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {

//        8 - Implemente um jogo no qual o programa escolhe um número aleatório entre 1 e 100,
//            e o jogador deve tentar adivinhá-lo. O programa deve fornecer dicas do tipo "maior" ou "menor" conforme necessário.

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int palpite = 0, numerodasorte = random.nextInt(100) + 1;

        System.out.println(" Vamos começar o jogo!!!");
        System.out.println(" Você deve acertar o numero da sorte!!!");
        while (palpite != numerodasorte) {
            System.out.println("Digite um numero!");
            palpite = scanner.nextInt();
            if (palpite == numerodasorte) {
                System.out.println("Parabéns voce acertou!!!");
            } else {
                if (palpite < numerodasorte) {
                    System.out.println("Seu palpite foi menor.");
                } else {
                    System.out.println("Seu palpite foi maior.");
                }
                System.out.println("Tente novamente");

            }

        }
    }
}
