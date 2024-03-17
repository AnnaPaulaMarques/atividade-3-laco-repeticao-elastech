import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {

//        7 - Crie uma calculadora simples que permita ao usuário realizar operações de soma,
//                subtração, multiplicação e divisão entre dois números,
//                utilizando um laço de repetição para continuar operando até que o usuário decida sair.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja bem vindo!!!");

        int menu = 0;

        while (menu != 5) {

            System.out.println("Qual operação aritmética você gostaria de realizar?");
            System.out.println(" 1 : Soma");
            System.out.println(" 2 : Subtração");
            System.out.println(" 3 : Multiplicação");
            System.out.println(" 4 : Divisão");
            System.out.println(" 5 : Opção sair");

            menu = scanner.nextInt();
            System.out.println("Digite o primeiro número para a operação?");
            int num1 = scanner.nextInt();
            System.out.println("Digite o segundo número para a operação ?");
            int num2 = scanner.nextInt();

            switch (menu) {
                case 1:
                    int resultado = num1 + num2;
                    System.out.println(" O resultado dessa operação é : " + num1 + " + " + num2 + " = " + resultado);
                    System.out.println("====================================================");
                    break;
                case 2:
                    int resultado2 = num1 - num2;
                    System.out.println(" O resultado dessa operação é : " + num1 + " - " + num2 + " = " + resultado2);
                    System.out.println("====================================================");
                    break;
                case 3:
                    int resultado3 = num1 * num2;
                    System.out.println(" O resultado dessa operação é : " + num1 + " * " + num2 + " = " + resultado3);
                    System.out.println("====================================================");
                    break;
                case 4:
                    double resultado4 = (double) num1 / num2;
                    if (num2 != 0) {
                        System.out.println(" O resultado dessa operação é : " + num1 + " / " + num2 + " = " + resultado4);
                    } else {
                        System.out.println("Não é possível dividir por zero.");
                    }

                    System.out.println("====================================================");
                    break;
                case 5:
                    System.out.println("Obrigada por usar a calculadora!");
                    System.out.println("====================================================");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
                    System.out.println("====================================================");
                    break;
            }
        }
    }
}