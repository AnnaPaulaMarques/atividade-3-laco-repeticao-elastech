
import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {

//        4 - Escreva um programa que verifique se um número digitado pelo usuário
//        é primo ou não.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, digite um número para saber se ele e primo");
        int numero = scanner.nextInt();

        if ((numero % 2 != 0) && (numero % 3 != 0)) {
            System.out.println("Este número é primo");
        } else {
            System.out.println("Este número não é primo");
        }

    }
}

//int resultado1 = numero %2;
//int resultado2 = numero %3;
//int resultado3 = numero %5;
//
//        if (resultado1 == 0 && resultado2 == 0 && resultado3 ==0 ){
//        System.out.println("Este número é primo");
//        } else {
//                System.out.println("Este número não é primo");
//        }
//
//                }
//                }
