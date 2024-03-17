import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {

//        9 -  Escreva um programa que converta a temperatura de Celsius para Fahrenheit ou vice-versa,
//                solicitando ao usuário qual conversão deseja fazer. O programa deve continuar executando até que o usuário decida sair.

        Scanner scanner = new Scanner(System.in);
        int menu;

        do {
            System.out.println("Olá, digite um valor da temperatura?");
            double temperatura = scanner.nextDouble();

            System.out.println("Agora informe em qual escala está a temperatura:");
            System.out.println("Opção 1: Celsius");
            System.out.println("Opção 2: Fahrenheit");
            System.out.println("Opção 3: Sair");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    double fahrenheit = (temperatura * 9 / 5) + 32;
                    System.out.println("Essa temperatura em Fahrenheit é: " + fahrenheit);
                    break;
                case 2:
                    double celsius = (temperatura - 32) * 5 / 9;
                    System.out.println("Essa temperatura em Celsius é: " + celsius);
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (menu != 3);
    }
}









