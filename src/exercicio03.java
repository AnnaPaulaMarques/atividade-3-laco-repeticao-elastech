import javax.sound.midi.Soundbank;

public class exercicio03 {
    public static void main(String[] args) {

//      3 - Desenvolva um algoritmo que calcule a soma dos números pares de 1 a 100.

        double soma = 0;

        for (int i = 1; i <= 100; i++) {
            double mod = i % 2;
            if (mod == 0) {
                soma = soma + i;
            }
        }
        System.out.println("A soma total dos números pares de 1 a 100 é: " + soma + "!!!");
    }
}
