
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {

//        6 - Faça um programa que solicite ao usuário números inteiros positivos.
//        Quando o usuário digitar um número negativo, o programa deve exibir
//        a média dos números inseridos até aquele momento.

        Scanner scanner = new Scanner(System.in);
        int media;

        System.out.println("Olá, por favor digite um número!");
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        int numero = scanner.nextInt();

        int total = 0;

        while (numero > 0) {
            listaNumeros.add(numero);
            numero = scanner.nextInt();
        }
        for (int i = 0; i < listaNumeros.size(); i++) {
            total = total + listaNumeros.get(i);
        }
        media = total / listaNumeros.size();
        System.out.println(" A media de números digitados é : " + media);
    }
}