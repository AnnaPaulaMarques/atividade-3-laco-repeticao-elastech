import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {

//      2 - Escreva um programa que solicite um número ao usuário e exiba a
//      tabuada desse número de 1 a 10.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, digite um número, que você gostaria de ver a tabuada? ");

        int numero = scanner.nextInt();

        System.out.println("Tabuada do número " + numero);

        if (numero > 10 || numero < 0) {
            System.out.println("Número inválido");
        } else {
            for (int i = 1; i <= 10; ++i) {
                System.out.println(numero + "X" + i + " = " + numero * i);
            }
        }
    }
}
